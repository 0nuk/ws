package agenda.config;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import agenda.persistencia.ContactoDao;
import agenda.persistencia.ContactoDaoMem;
import agenda.persistencia.ContactoDaoSerial;

public class Config {
	
	private static ContactoDao cDao; 
	private static Properties prop;
	
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
}
