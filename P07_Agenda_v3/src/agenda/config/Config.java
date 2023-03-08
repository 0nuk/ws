package agenda.config;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

import agenda.persistencia.ContactoDao;
import agenda.persistencia.ContactoDaoMem;
import agenda.persistencia.ContactoDaoSQL;
import agenda.persistencia.ContactoDaoSerial;

public class Config {
	
	private static ContactoDao cDao; 
	private static Properties prop;
	private static DataSource ds;
	
	public static ContactoDao getContactoDao() {
		if (cDao == null) {
			String tipoDao = getProperty("daos");
			switch (tipoDao) {
			case "mem":
				cDao = new ContactoDaoMem();
				break;
			case "serial":
				cDao = new ContactoDaoSerial();
				break;
			case "sql":
				cDao = new ContactoDaoSQL();
				break;
			default:
				cDao = new ContactoDaoSerial();
				break;			
			}
		}
		return cDao;
	}
	
	private static Properties getProp() {
		if(prop == null) {
			prop = new Properties();
			try {
				prop.load(new FileReader("agenda.properties"));
			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException();
			}
		}
		return prop;
	}
	
	public static String getProperty(String clave) {
		String valor = getProp().getProperty(clave);
		if(valor == null) valor = "";
		return valor;
	}
	
	public static DataSource getDataSource() {
		if(ds==null) {
			BasicDataSource bds = new BasicDataSource();
			bds.setDriverClassName(getProperty("bbdd.driver"));
			bds.setUrl(getProperty("bbdd.url"));
			bds.setUsername(getProperty("bbdd.user"));
			bds.setPassword(getProperty("bbdd.pwd"));
			ds = bds;
		}
		return ds;
	}
}
