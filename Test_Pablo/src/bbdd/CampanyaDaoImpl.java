package bbdd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class CampanyaDaoImpl implements CampanyaDao {

	private DataSource ds;

	public CampanyaDaoImpl() {
		BasicDataSource bds = new BasicDataSource();
		bds.setUrl("jdbc:mysql://localhost:3306/06_tienda");
		bds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		bds.setUsername("root");
		bds.setPassword("root");
		ds = bds;
	}

	@Override
	public void insert(List<String[]> datosCamp) {
		String sql = """
					insert into productos values (null, ?, ?, ?);
				""";
		try (Connection con = ds.getConnection()) {
			con.setAutoCommit(false);
			PreparedStatement ps = con.prepareStatement(sql);
			for (String[] datoCamp : datosCamp) {
				ps.setString(1, datoCamp[0]);
				ps.setDouble(2, Double.parseDouble(datoCamp[1]));
				ps.setInt(3, Integer.parseInt(datoCamp[2]));
				ps.executeUpdate();
			}
			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void insert(String[] datoCamp) {
		List<String[]> lista = new LinkedList<>();
		lista.add(datoCamp);
		insert(lista);
	}

	public void prueba() {
		try (Connection con = ds.getConnection()) {
			String sql = """
					select * from productos
					join fabricantes on fk_fabricante = id_fabricante
					order by id_producto
					""";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\t");
				System.out.print(rs.getString(6) + "\n");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
