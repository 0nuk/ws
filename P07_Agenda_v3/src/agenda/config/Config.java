package agenda.config;

import agenda.persistencia.ContactoDao;
import agenda.persistencia.ContactoDaoSerial;

public class Config {
	public static ContactoDao getContactoDao() {
		return new ContactoDaoSerial();
	}
}
