package colecciones.genericos.test;

import java.util.Iterator;

import colecciones.genericos.listas.Lista;
import colecciones.genericos.listas.ListaArray;
import colecciones.genericos.listas.ListaEnlazada;

public class TestListaGenericos {
	public static void main(String[] args) {
		
		ListaArray<Integer> la = new ListaArray<>();
		la.agregar(45);
		la.agregar(991);
		la.agregar(18);
		la.agregar(7);
		la.agregar(22);
		la.agregar(1);
		recorreIter(la);

		System.out.println("\n\n\n");

		ListaEnlazada<Integer> le = new ListaEnlazada<>();
		le.agregar(45);
		le.agregar(991);
		le.agregar(18);
		le.agregar(7);
		le.agregar(22);
		le.agregar(1);	
		recorreIter(le);
	}
	
	public static <T> void recorre(Lista<T> lista) {
		for (int i = 0; i < lista.tamanyo(); i++) {
			System.out.println(lista.buscar(i));
		}
	}

	public static void recorreIter(Lista<Integer> lista) {
		Iterator<Integer> it = lista.iterator();
		while(it.hasNext()) {
			Integer elemento = it.next();
			System.out.println(elemento);
		}
	}
	
	public static void recorreForEach(Lista<Integer> lista) {
		for(Integer elemento : lista) {
			System.out.println(elemento);
		}
	}
}
