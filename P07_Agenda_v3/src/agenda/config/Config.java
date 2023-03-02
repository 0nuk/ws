package agenda.config;

import agenda.persistencia.ContactoDao;
import agenda.persistencia.ContactoDaoSerial;

public class Config {
	
	private static ContactoDao cDao; 
	
	public static ContactoDao getContactoDao() {
		if (cDao == null) {
			 cDao = new ContactoDaoSerial();
		}
		return cDao;
	}
}
