package agenda.persistencia;
import java.util.Set;

import agenda.modelo.Contacto;

public class ContactoDaoSimulado implements ContactoDao{

	@Override
	public void insertar(Contacto c) {
		System.out.println("Se ha insertado " + c);
	}
	@Override
	public boolean eliminar(int idContacto) {
		System.out.println("Se elimino " + idContacto);
		return true;
	}
	@Override
	public Contacto buscar(int idContacto) {
		Contacto c = new Contacto();
		c.setIdContacto(idContacto);
		c.setNombre("Jose");
		c.setApodo("Pepe");
		return c;
	}
	@Override
	public void actualizar(Contacto contacto) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Set<Contacto> buscar(String nom) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Set<Contacto> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}
}
