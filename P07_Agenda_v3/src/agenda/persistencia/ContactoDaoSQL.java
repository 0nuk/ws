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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void actualizar(Contacto contacto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Contacto buscar(int idContacto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Contacto> buscar(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Contacto> buscarTodos() {
		Set<Contacto> contactoSet = new TreeSet<>();
		String sql = "SELECT * FROM contactos con JOIN telefonos tel ON con.idcontactos = tel.fk_contacto JOIN correos cor ON con.idcontactos = cor.fk_contacto";
		try(Connection con = ds.getConnection()) {
			con.setAutoCommit(false);
			PreparedStatement ps = con.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return contactoSet;
	}

}
