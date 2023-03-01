package agenda.negocio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

import agenda.modelo.Contacto;
import agenda.modelo.Domicilio;
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
		int cont = 0;
		try(BufferedReader br = new BufferedReader(new FileReader(fichero))) {
			String linea;
			while((linea = br.readLine()) != null ){
				String[] leida = linea.split(";");
				dao.insertar(creaContacto(leida));
				cont++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return cont;
	}
	
	public Contacto creaContacto(String[] leida) {
		Contacto c = new Contacto();
		c.setNombre(leida[0]);
		c.setApellidos(leida[1]);
		c.setApodo(leida[2]);
		c.addTelefonos(separador(leida[11]));
		c.addCorreos(separador(leida[12]));
		c.setDom(creaDomicilio(leida));
		return c;
	}
	
	public Domicilio creaDomicilio(String[] leida) {
		Domicilio dom = new Domicilio();
		dom.setTipoVia(leida[3]);
		dom.setVia(leida[4]);
		dom.setNumero(Integer.parseInt(leida[5]));
		dom.setPiso(Integer.parseInt(leida[6]));
		dom.setPuerta(leida[7]);
		dom.setCodigoPostal(leida[8]);
		dom.setCiudad(leida[9]);
		dom.setProvincia(leida[10]);
		return dom;
	}
	
	public String[] separador(String leida) {
		String[] separado = leida.split("/");
		return separado;
	}
}
