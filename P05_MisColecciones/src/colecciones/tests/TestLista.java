package colecciones.tests;

import colecciones.listas.Lista;
import colecciones.listas.ListaArray;
import colecciones.listas.ListaEnlazada;

public class TestLista {
	public static void main(String[] args) {
		ListaArray la = new ListaArray(2);
		la.agregar("primero");
		la.agregar("segundo");
		la.agregar("tercero");
		la.agregar("cuarto");
		la.agregar("quinto");
		recorre(la);
		
		ListaEnlazada le = new ListaEnlazada();
		le.agregar("primero");
		le.agregar("segundo");
		le.agregar("tercero");
		le.agregar("cuarto");
		le.agregar("quinto");
		recorre(le);
	}
	
	public static void recorre(Lista lista) {
		for (int i = 0; i < lista.tamanyo(); i++) {
			System.out.println(lista.buscar(i));
		}
	}
}
