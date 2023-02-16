package sets;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Test01Hash {
	public static void main(String[] args) {
		Set<String> hs = new LinkedHashSet<>();
		
		hs.add("lunes");
		hs.add("martes");
		hs.add("miercoles");
		hs.add("jueves");
		hs.add("viernes");
		hs.add("lunes");
		for(String dia : hs) {
			System.out.println(dia);
		}
		List<String> lista = new ArrayList<>(hs);
		
		for(String dias : lista) {
			System.out.println(dias);
		}
	}
}
