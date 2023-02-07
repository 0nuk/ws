package agenda.negocio;
import agenda.modelo.Contacto;
import agenda.persistencia.ContactoDao;
import agenda.persistencia.ContactoDaoSimulado;

public class Agenda {
	
	private ContactoDao cDao =  new ContactoDaoSimulado();
	
	public void insetarContacto(Contacto c) {
		cDao.insertar(c);
	}
	
	public void borrar(int idContacto) {
		cDao.eliminar(idContacto);
	}
}
