package agenda.persistencia;
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
}
