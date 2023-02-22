package agenda.negocio;

import java.util.Set;

import agenda.modelo.Contacto;
import agenda.persistencia.ContactoMapDao;

public class AgendaImpl implements Agenda {
	ContactoMapDao dao = new ContactoMapDao();
	@Override
	public void insetarContacto(Contacto c) {
		dao.insertar(c);
		
	}

	@Override
	public Contacto eliminar(int idContacto) {
		Contacto c = new Contacto();
		c = dao.buscar(idContacto);
		dao.eliminar(idContacto);
		return c;
	}

	@Override
	public boolean eliminar(Contacto c) {
		
	}

	@Override
	public void modificar(Contacto c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<Contacto> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
