package ficheros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class LeerFichero {
	
	public static void main(String[] args) {
		String fich = "/datos/productos.xml";
//		procesaPorLinea(fich);
		procesaPorLinea("/datos/datos.csv");
		
		List<String[]> original = procesaCSV("/datos/datos.csv");
		muestraProcesado(original);
		
		List<String[]> nuevo = eliminaColumnas(original, 1,2,4);
		muestraProcesado(nuevo);
	}

	public static void procesaPorLinea(String nomFichero) {
		Path fichero = Paths.get(nomFichero);
		try {
			for (String linea : Files.readAllLines(fichero)) {
				System.out.println(linea);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static List<String[]> procesaCSV(String nomFichero) {
		List<String[]> resu = new LinkedList<>();
		Path fichero = Paths.get(nomFichero);
		try {
			for (String linea : Files.readAllLines(fichero)) {
				resu.add(linea.split(","));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return resu;
	}
	
	public static void muestraProcesado(List<String[]> datos) {
		for (String[] linea : datos) {
			for (int i = 0; i < linea.length; i++) {
				System.out.println(linea[i]);
			}
			System.out.println("-----");
		}
	}
	
	public static List<String[]> eliminaColumnas(List<String[]> datos, int... cols) {
		List<String[]> resu = new LinkedList<>();
		String[] nuevo;
		for (String[] linea : datos) {
			nuevo = new String[linea.length - cols.length];
			int j = 0, k = 0; // j para nuevo... k para cols
			for (int i = 0; i < linea.length; i++) {
				if (k < cols.length && cols[k] == i)
					k++;
				else 
					nuevo[j++] = linea[i];
			}
			resu.add(nuevo);
		}
		return resu;
	}
}
