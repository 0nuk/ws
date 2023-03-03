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
			String tipoDao = getProp().getProperty("daos");
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
			
			cDao = new ContactoDaoSerial();
		}
		return cDao;
	}
	
	public static Properties getProp() {
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
}
