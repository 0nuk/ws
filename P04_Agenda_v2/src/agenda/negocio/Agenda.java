package agenda.negocio;

import agenda.modelo.Contacto;

public interface Agenda {
	
	void insetarContacto(Contacto c); 
	void borrar(int idContacto);
}
