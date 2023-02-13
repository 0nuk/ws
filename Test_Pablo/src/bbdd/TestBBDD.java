package bbdd;

import java.util.ArrayList;
import java.util.List;

public class TestBBDD {
	public static void main(String[] args) {
		CampanyaDaoImpl dao = new CampanyaDaoImpl();
		dao.prueba();
		System.out.println("------------");
		
		String[] prueba = {"Telefono movil GS856", "855.99","2"};
		String[] prueba2 = {"Telefono movil HN32", "429.90", "1"};
		List<String[]> lista = new ArrayList<>();
		lista.add(prueba);
		lista.add(prueba2);
		
		dao.insert(lista);
		
		dao.prueba();
	}
}
