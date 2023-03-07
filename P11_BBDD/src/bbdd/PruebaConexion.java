package bbdd;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class PruebaConexion {
	public static void main(String[] args) throws SQLException {
		DataSource ds;
		BasicDataSource bds = new BasicDataSource();
		bds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		bds.setUrl("jdbc:mysql://10.2.1.10/50_examen_banco");
		bds.setUsername("remoto");
		bds.setPassword("remoto");
		ds = bds;
		
		Connection con = ds.getConnection();
		String sql = "SELECT * FROM tarjetas where fk_cuenta = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, 10);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt("id_tarjeta"));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString("marca"));
		}
		con.close();
	}
}
