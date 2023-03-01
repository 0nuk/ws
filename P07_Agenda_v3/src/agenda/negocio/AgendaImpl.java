package agenda.negocio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

import agenda.modelo.Contacto;
import agenda.persistencia.ContactoDaoMem;

public class AgendaImpl implements Agenda {
	ContactoDaoMem dao = new ContactoDaoMem();
	
	@Override
	public void insertarContacto(Contacto c) {
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
		return dao.eliminar(c.getIdContacto());
	}

	@Override
	public void modificar(Contacto c) {
		dao.actualizar(c);
		
	}

	@Override
	public Set<Contacto> buscarTodos() {
		Set<Contacto> todos = new TreeSet<>((o1, o2)-> (o1.getApodo()+o1.getIdContacto()).compareToIgnoreCase(o2.getApodo()+o2.getIdContacto()));
		todos.addAll(dao.buscarTodos());
		return todos;	
	}

	@Override
	public Set<Contacto> buscarContactoPorNombre(String nombre) {
		return dao.buscar(nombre);
	}

	@Override
	public int importarCSV(String fichero) throws IOException {
		
		try(BufferedReader br = new BufferedReader(new FileReader(fichero))) {
			String linea;
			while((linea = br.readLine()) != null ){
				String[] leida = linea.split(";");
				Muestra01.print(leida);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
