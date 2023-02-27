package excepciones;

import java.io.IOException;
import java.sql.SQLException;

public class E05 {

	public static void main(String[] args) throws SQLException {
		try {
			abreRecurso(5);
			System.out.println("abrió correctamente");
			utilizaRecurso(0);
			System.out.println("utilizó correctamente");
			cierraRecurso(5);
		} catch (IOException e) {
			System.out.println("Fallo en abrir o ioe utilizada");
			System.out.println("arreglado");
		} finally {
			// if (abrio())
			try {	
				cierraRecurso(5);
				System.out.println("cerro recurso");
			} catch (IOException e) {
				System.out.println("Fallo en cerrar");
				System.out.println("arreglado");
				
			}
			System.out.println("Esto se ejecuta siempre!!!");
		}
		System.out.println("esta pensado si todo va bien");
	}
	
	
	
	public static void abreRecurso(int num) throws IOException {
		if (num == 0) throw new IOException();
	}
	
	public static void utilizaRecurso(int num) throws IOException, SQLException {
		if (num == 0) throw new IOException();
		if (num == 1) throw new SQLException();
	}
	
	public static void cierraRecurso(int num) throws IOException {
		if (num == 0) throw new IOException();
		
	}
}

