package listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		LinkedList<String> ll = new LinkedList<>();
		final int CANT = 10;
		
		long t0 = System.currentTimeMillis();
		cargaLista(al, CANT);
		long tf = System.currentTimeMillis();
		System.out.println("Carga ArrayList " + (tf-t0));
		t0 = System.currentTimeMillis();
		recorreIterator(al);
		tf = System.currentTimeMillis();
		System.out.println("Recorre ArrayList " + (tf-t0));
		
		t0 = System.currentTimeMillis();
		cargaLista(ll, CANT);
		tf = System.currentTimeMillis();
		System.out.println("Carga LinkedList " + (tf-t0));
		t0 = System.currentTimeMillis();
		recorreIterator(ll);
		tf = System.currentTimeMillis();
		System.out.println("Recorre LinkedList " + (tf-t0));
	}
	
	public static void cargaLista(List<String> lista, int cant) {
		for (int i = 1; i < cant; i++) {
				lista.add("a");
		}
	}
	
	public static void recorre(List<String> lista) {
		for (int i = 0; i < lista.size(); i++) {
			@SuppressWarnings("unused")
			String elemento =lista.get(i);
		}
	}
	
	public static void recorreIterator(List<String> lista) {
		Iterator<String> it = lista.iterator();
		while(it.hasNext()) {
//			String elemento = it.next();
			System.out.println(it.next());
		}
		
	}
}