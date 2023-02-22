package agenda.persistencia;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import agenda.modelo.Contacto;

public class ContactoMapDao implements ContactoDao {

	private Map<Integer, Contacto> almacen = new HashMap<>();
	private int id = 1;
	
	@Override
	public void insertar(Contacto c) {
		c.setIdContacto(id);
		almacen.put(id++, c);
	}

	@Override
	public boolean eliminar(int idContacto) {
		Contacto c = new Contacto();
		c = almacen.remove(idContacto);
		if(c==null) {
			return false;
		} else {
			return true;
		}
			
	}

	@Override
	public void actualizar(Contacto contacto) {
		almacen.replace(contacto.getIdContacto(), contacto);
		
	}

	@Override
	public Contacto buscar(int idContacto) {
		return almacen.get(idContacto);
	}

	@Override
	public Set<Contacto> buscar(String nom) {
		Set<Contacto> c = new HashSet<>();
		for(Contacto contacto : almacen.values()) {
			if(contacto.getApellidos().indexOf(nom)!=-1||contacto.getNombre().indexOf(nom)!=-1||contacto.getApodo().indexOf(nom)!=-1) {
				c.add(contacto);
			}
		}
		return c;
	}

	@Override
	public Set<Contacto> buscarTodos() {
		return new TreeSet<>(almacen.values());
	}

}
