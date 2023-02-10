package listas;

import java.util.LinkedList;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
		List<String> lista = new LinkedList<>();
		lista.add("enero");
		lista.add("febrero");
		lista.add("marzo");
		lista.add("abril");
		
		System.out.println(lista.size());
		System.out.println(lista.get(2));
		System.out.println(lista.get(3));
	}
}
