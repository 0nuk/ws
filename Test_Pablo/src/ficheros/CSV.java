package ficheros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CSV {
	public static void main(String[] args) {
//		String fichConvertia = "C:\\Users\\Tardes\\Downloads\\Convertia__Reporte Afiliados_Data analytics-Campañas_Tabla.csv\\";
//		String fichAds = "C:\\Users\\Tardes\\Downloads\\convertia_report.csv\\";
		
		
		String fichConvertia = "/home/conde/Downloads/Convertia__Reporte Afiliados_Data analytics-Campañas_Tabla.csv/";
		String fichAds = "/home/conde/Downloads/Campaign_report.csv/";
		
		
		muestraProcesado(unirCSV(convierteConvertia(fichConvertia),convierteAds(fichAds)));
		muestraList(convierte(unirCSV(convierteConvertia(fichConvertia),convierteAds(fichAds))));

	}
	
	public static String quitaComas(String linea) {
		while(linea.indexOf("\"")!=-1) {
			int posComilla;
			int posComa;
			posComilla = linea.indexOf("\"");
			posComa = linea.indexOf(",", posComilla);
			linea = linea.substring(0, posComilla) + linea.substring(posComilla+1, posComa) + linea.substring(posComa+1, linea.indexOf("\"", posComa)) + linea.substring(linea.indexOf("\"", posComa)+1, linea.length());
		}
		return linea;
	}
	
	public static List<String[]> procesaCSV(String nomFichero) {
		List<String[]> resu = new LinkedList<>();
		Path fichero = Paths.get(nomFichero);
		try {
			for (String linea : Files.readAllLines(fichero)) {
				linea = quitaComas(linea);
				resu.add(linea.split(","));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return resu;
	}
	
	public static List<String> convierte(List<String[]> datos){
		List<String> resu = new LinkedList<>();
		for (String[] linea : datos) {
			String comodin = "";
			for (int i = 0; i < linea.length; i++) {
				if(i<linea.length-1) {					
					comodin = comodin + linea[i] + ",";
				} else {
					comodin = comodin + linea[i];
				}
			}
			resu.add(comodin);
		}
		return resu;
	}
	
	public static void muestraProcesado(List<String[]> datos) {
		for (String[] linea : datos) {
			for (int i = 0; i < linea.length; i++) {
				System.out.print(linea[i] + "\t|");
			}
			System.out.println();
		}
	}
	
	public static void muestraList(List<String> datos) {
		for(String linea : datos) {
			System.out.println(linea);
		}
	}
	public static void modificarNombre(List<String[]> datos){
		for(String[] linea : datos) {
			if(linea[0].indexOf("Campa")==-1)
				linea[0]=linea[0].substring(36);
		}
	}
	

	public static void eliminaFilasAds(List<String[]> datos) {
		datos.remove(1);
		for(Iterator<String[]> it = datos.iterator(); it.hasNext();) {
			String[] linea = it.next();
			if (linea[0].indexOf("Campaign report") != -1 || linea[0].indexOf("Total") != -1 || linea[0].indexOf("2023") != -1) {
				it.remove();
			}
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
	
	public static List<String[]> convierteConvertia(String nomFichero){
		List<String[]> nuevoConvertia = procesaCSV(nomFichero);
		nuevoConvertia = eliminaColumnas(nuevoConvertia, 3, 4);
		modificarNombre(nuevoConvertia);
		return nuevoConvertia;
	}
	
	public static List<String[]> convierteAds(String nomFichero){
		List<String[]> nuevoAds = procesaCSV(nomFichero);
		eliminaFilasAds(nuevoAds);
		nuevoAds = eliminaColumnas(nuevoAds, 0, 2, 3, 4, 5, 7, 8, 14, 15, 16, 17, 18);
		
		return nuevoAds;
	}

	public static List<String[]> unirCSV(List<String[]> nuevoConvertia, List<String[]> nuevoAds){
		List<String[]> unido = new LinkedList<>();
		Iterator<String[]> ads = nuevoAds.iterator();
		String[] nuevo;
		String[] comodin;
		int i = 0;
		while(ads.hasNext()) {
			nuevo = new String[9];
			comodin = ads.next();
			i = 0;
			for(String[] linea : nuevoConvertia) {
				
				if(linea[0].equals(comodin[0])||comodin[0].equals("Campaign")) {
					for(; i<linea.length; i++) {
						nuevo[i] = linea[i];
					}
				} else {
					nuevo[0] = comodin[0];
					nuevo[1] = "0";
					nuevo[2] = "0";
					i = 3;
				}
			}
			for(int j = 1; j < comodin.length; j++) {
				nuevo[i] = comodin[j];
				i++;
			}
			unido.add(nuevo);
		}
		return unido;
	}
	
}
