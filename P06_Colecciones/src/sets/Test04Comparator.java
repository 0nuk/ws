package sets;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import agenda.modelo.Contacto;

public class Test04Comparator {
	public static void main(String[] args) {
		Contacto c1 = new Contacto(50, "Amancio", "Poca Pasta");
		Contacto c2 = new Contacto(10, "Pedro", "Zeta");
		Contacto c3 = new Contacto(75, "Mario", "Zeta");
		
		Set<Contacto> arbol = new TreeSet<>(new ContactoIdComparator());
		arbol.add(c1);
		arbol.add(c2);
		arbol.add(c3);
		
		for (Contacto contacto : arbol) {
			System.out.println(contacto);
		}
		System.out.println("-----------------");
		Set<Contacto> arbol2 = new TreeSet<>(new Comparator<Contacto>(){
			@Override
			public int compare(Contacto o1, Contacto o2) {
				return (o1.getApodo()+o1.getIdContacto()).compareToIgnoreCase(o2.getApodo()+o2.getIdContacto());
			} 
		});
		
		arbol2.addAll(arbol);
		
		for (Contacto contacto : arbol2) {
			System.out.println(contacto);
		}
		
	}
}
