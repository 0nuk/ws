package agenda.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;
import java.util.TreeSet;
import javax.sql.DataSource;
import agenda.config.Config;
import agenda.exception.PersistenciaException;
import agenda.modelo.Contacto;

public class ContactoDaoSQL implements ContactoDao{
	
	private DataSource ds;
	
	public ContactoDaoSQL() {
		ds = Config.getDataSource();		
	}
	@Override
	public void insertar(Contacto c) {
		String sql = "INSERT INTO contactos VALUES(null,?,?,?,?,?,?,?,?,?,?,?)";
		try(Connection con = ds.getConnection()){
			con.setAutoCommit(false);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, c.getNombre());
			ps.setString(2, c.getApellidos());
			ps.setString(3, c.getApodo());
			ps.setString(4, c.getDom().getTipoVia());
			ps.setString(5, c.getDom().getVia());
			ps.setInt(6, c.getDom().getNumero());
			ps.setInt(7, c.getDom().getPiso());
			ps.setString(8, c.getDom().getPuerta());
			ps.setString(9, c.getDom().getCodigoPostal());
			ps.setString(10, c.getDom().getCiudad());
			ps.setString(11, c.getDom().getProvincia());
			int filas = ps.executeUpdate();
			
			if(filas == 1) {
				PreparedStatement psId = con.prepareStatement("SELECT LAST_INSERT_ID()");
				ResultSet rs = psId.executeQuery();
				rs.next();
				int idGenerado = rs.getInt(1);
				
				sql = "INSERT INTO telefonos VALUES(null,?,?)";
				PreparedStatement psTel = con.prepareStatement(sql);
				
				int cantTel = 0;
				
				for (String telefono : c.getTelefonos()) {
					psTel.setInt(1, idGenerado);
					psTel.setString(2, telefono);
					cantTel += psTel.executeUpdate();
				}
				
				sql = "INSERT INTO correos VALUES(null,?,?)";
				PreparedStatement psCor = con.prepareStatement(sql);
				
				int cantCor = 0;
				
				for (String correo : c.getCorreos()) {
					psCor.setInt(1, idGenerado);
					psCor.setString(2, correo);
					cantCor += psCor.executeUpdate();
				}
				
				if(cantTel == c.getTelefonos().size() && cantCor == c.getCorreos().size()) {
					con.commit();
				} else {
					con.rollback();
					throw new PersistenciaException();
				}
			} else {
				con.rollback();
				throw new PersistenciaException();
			}	
		} catch (SQLException e) {
			e.printStackTrace();
			throw new PersistenciaException();
		}
	}

	@Override
	public boolean eliminar(int idContacto) {
		boolean retu = false;
		String sql = "DELETE FROM contactos WHERE idcontactos = ?";
		try(Connection con = ds.getConnection()){
			con.setAutoCommit(false);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, idContacto);
			int resu = ps.executeUpdate();
			if(resu == 1) {
				con.commit();
				retu = true;
			} else {
				con.rollback();
				throw new PersistenciaException();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new PersistenciaException();
		}
		return retu;
	}

	@Override
	public void actualizar(Contacto contacto) {
		String sql = "UPDATE contactos SET nombre = ?, apellidos = ?, apodo = ?, tipo_via = ?, via = ?, numero = ?, piso = ?, puerta = ?, codigo_postal = ?, ciudad = ?, provincia = ? WHERE idcontactos = ?";
		String sqlT = "DELETE FROM telefonos WHERE fk_contacto = ?";
		String sqlC = "DELETE FROM correos WHERE fk_contacto = ?";
		try(Connection con = ds.getConnection()){
			con.setAutoCommit(false);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, contacto.getNombre());
			ps.setString(2, contacto.getApellidos());
			ps.setString(3, contacto.getApodo());
			ps.setString(4, contacto.getDom().getTipoVia());
			ps.setString(5, contacto.getDom().getVia());
			ps.setInt(6, contacto.getDom().getNumero());
			ps.setInt(7, contacto.getDom().getPiso());
			ps.setString(8, contacto.getDom().getPuerta());
			ps.setString(9, contacto.getDom().getCodigoPostal());
			ps.setString(10, contacto.getDom().getCiudad());
			ps.setString(11, contacto.getDom().getProvincia());
			ps.setInt(12, contacto.getIdContacto());
			int filas = ps.executeUpdate();
			
			PreparedStatement psT = con.prepareStatement(sqlT);
			psT.setInt(1, contacto.getIdContacto());
			psT.executeUpdate();
			
			PreparedStatement psC = con.prepareStatement(sqlC);
			psC.setInt(1, contacto.getIdContacto());
			psC.executeUpdate();
			
			String sqlTel = "INSERT INTO telefonos VALUES(null, ?, ?)";
			
			PreparedStatement psTel = con.prepareStatement(sqlTel);
			for(String telefono : contacto.getTelefonos()) {
				psTel.setInt(1, contacto.getIdContacto());
				psTel.setString(2, telefono);
				psTel.executeUpdate();
			}
			
			String sqlCor = "INSERT INTO correos VALUES(null, ?, ?)";
			
			PreparedStatement psCor = con.prepareStatement(sqlCor);
			for(String correo : contacto.getCorreos()) {
				psCor.setInt(1, contacto.getIdContacto());
				psCor.setString(2, correo);
				psCor.executeUpdate();
			}
			
			if(filas == 1) {
				con.commit();
			} else {
				con.rollback();
				throw new PersistenciaException();
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new PersistenciaException();
		}
		
	}

	@Override
	public Contacto buscar(int idContacto) {
		Contacto c = new Contacto();
		String sql = "SELECT * FROM contactos WHERE fk_contacto = ?";
		String sqlT = "SELECT * FROM telefonos WHERE fk_contacto = ?";
		String sqlC = "SELECT * FROM correos WHERE fk_contacto = ?";
		
		try(Connection con = ds.getConnection()) {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, idContacto);
			ResultSet rs = ps.executeQuery();

				c.setIdContacto(rs.getInt(1));
				c.setNombre(rs.getString(2));
				c.setApellidos(rs.getString(3));
				c.setApodo(rs.getString(4));
				c.getDom().setTipoVia(rs.getString(5));
				c.getDom().setVia(rs.getString(6));
				c.getDom().setNumero(rs.getInt(7));
				c.getDom().setPiso(rs.getInt(8));
				c.getDom().setPuerta(rs.getString(9));
				c.getDom().setCodigoPostal(rs.getString(10));
				c.getDom().setCiudad(rs.getString(11));
				c.getDom().setProvincia(rs.getString(12));
						
				PreparedStatement psT = con.prepareStatement(sqlT);
				psT.setInt(1, idContacto);
				ResultSet rsT = psT.executeQuery();
				
				PreparedStatement psC = con.prepareStatement(sqlC);
				psC.setInt(1, idContacto);
				ResultSet rsC = psC.executeQuery();
				
				while(rsT.next()) {
					c.addTelefono(rsT.getString(3));
				}
				while(rsC.next()) {
					c.addCorreo(rsC.getString(3));
				}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new PersistenciaException();
		}
		return c;
	}
	

	@Override
	public Set<Contacto> buscar(String nom) {
		Set<Contacto> contactoSet = new TreeSet<>();
		String sql = "SELECT * FROM contactos WHERE nombre LIKE ? OR apellidos LIKE ? OR apodo LIKE ?";
		String sqlT = "SELECT * FROM telefonos WHERE fk_contacto = ?";
		String sqlC = "SELECT * FROM correos WHERE fk_contacto = ?";
		
		try(Connection con = ds.getConnection()) {
			PreparedStatement ps = con.prepareStatement(sql);
			String param = "%" + nom + "%";
			ps.setString(1, param);
			ps.setString(2, param);
			ps.setString(3, param);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Contacto c = new Contacto();
				c.setIdContacto(rs.getInt(1));
				c.setNombre(rs.getString(2));
				c.setApellidos(rs.getString(3));
				c.setApodo(rs.getString(4));
				c.getDom().setTipoVia(rs.getString(5));
				c.getDom().setVia(rs.getString(6));
				c.getDom().setNumero(rs.getInt(7));
				c.getDom().setPiso(rs.getInt(8));
				c.getDom().setPuerta(rs.getString(9));
				c.getDom().setCodigoPostal(rs.getString(10));
				c.getDom().setCiudad(rs.getString(11));
				c.getDom().setProvincia(rs.getString(12));
				
				int id = rs.getInt(1);
				
				PreparedStatement psT = con.prepareStatement(sqlT);
				psT.setInt(1, id);
				ResultSet rsT = psT.executeQuery();
				
				PreparedStatement psC = con.prepareStatement(sqlC);
				psC.setInt(1, id);
				ResultSet rsC = psC.executeQuery();
				
				while(rsT.next()) {
					c.addTelefono(rsT.getString(3));
				}
				while(rsC.next()) {
					c.addCorreo(rsC.getString(3));
				}
				contactoSet.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new PersistenciaException();
		}
		return contactoSet;
	}

	@Override
	public Set<Contacto> buscarTodos() {
		Set<Contacto> contactoSet = new TreeSet<>();
		String sql = "SELECT * FROM contactos";
		String sqlT = "SELECT * FROM telefonos WHERE fk_contacto = ?";
		String sqlC = "SELECT * FROM correos WHERE fk_contacto = ?";
		
		try(Connection con = ds.getConnection()) {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Contacto c = new Contacto();
				c.setIdContacto(rs.getInt(1));
				c.setNombre(rs.getString(2));
				c.setApellidos(rs.getString(3));
				c.setApodo(rs.getString(4));
				c.getDom().setTipoVia(rs.getString(5));
				c.getDom().setVia(rs.getString(6));
				c.getDom().setNumero(rs.getInt(7));
				c.getDom().setPiso(rs.getInt(8));
				c.getDom().setPuerta(rs.getString(9));
				c.getDom().setCodigoPostal(rs.getString(10));
				c.getDom().setCiudad(rs.getString(11));
				c.getDom().setProvincia(rs.getString(12));
				
				int id = rs.getInt(1);
				
				PreparedStatement psT = con.prepareStatement(sqlT);
				psT.setInt(1, id);
				ResultSet rsT = psT.executeQuery();
				
				PreparedStatement psC = con.prepareStatement(sqlC);
				psC.setInt(1, id);
				ResultSet rsC = psC.executeQuery();
				
				while(rsT.next()) {
					c.addTelefono(rsT.getString(3));
				}
				while(rsC.next()) {
					c.addCorreo(rsC.getString(3));
				}
				contactoSet.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new PersistenciaException();
		}
		return contactoSet;
	}

}
