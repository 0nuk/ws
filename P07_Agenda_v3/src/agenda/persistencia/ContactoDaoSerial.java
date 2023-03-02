package agenda.persistencia;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import agenda.modelo.Contacto;

public class ContactoDaoSerial implements ContactoDao {

	private Almacen almacen;
	private final String FICHERO = "agenda.dat";
	
	public ContactoDaoSerial() throws RuntimeException{
		try(FileInputStream fis = new FileInputStream(FICHERO)){
			ObjectInputStream ois = new ObjectInputStream(fis);
			almacen  = (Almacen) ois.readObject();
		} catch (FileNotFoundException e) {
			almacen = new Almacen(); 
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		
	}
	
	private void grabarAlmacen() {
		try(FileOutputStream fos = new FileOutputStream(FICHERO)){
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(almacen);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	@Override
	public void insertar(Contacto c) {
		c.setIdContacto(almacen.autoIncrement);
		almacen.mapa.put(almacen.autoIncrement++, c);
		grabarAlmacen();
	}

	@Override
	public boolean eliminar(int idContacto) {
		boolean eli =  almacen.mapa.remove(idContacto) != null;
		grabarAlmacen();
		return eli;
	}

	@Override
	public void actualizar(Contacto contacto) {
		almacen.mapa.replace(contacto.getIdContacto(), contacto);
		grabarAlmacen();
	}

	@Override
	public Contacto buscar(int idContacto) {
		return almacen.mapa.get(idContacto);
	}

	@Override
	public Set<Contacto> buscar(String nom) {
		nom = nom.toLowerCase();
		Set<Contacto> encontrados = new HashSet<>();
		for(Contacto c : almacen.mapa.values()) {
			if(c.getApellidos().toLowerCase().contains(nom) || c.getApodo().toLowerCase().contains(nom) || c.getNombre().toLowerCase().contains(nom)) {
				encontrados.add(c);
			}
		}
		return encontrados;
	}

	@Override
	public Set<Contacto> buscarTodos() {
		return new TreeSet<>(almacen.mapa.values());
	}

}
