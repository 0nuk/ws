package agenda.vista;

import java.util.Scanner;
import agenda.modelo.Contacto;
import agenda.negocio.Agenda;
import agenda.negocio.AgendaImpl;

public class MenuPrincipal {
	private Agenda neg = new AgendaImpl();
	Scanner tec = new Scanner(System.in);
	
	public MenuPrincipal() {
		menu();
	}
	
	private void menu() {
		System.out.println("¡Super Agenda 86!");
		System.out.println("-----------------");
		boolean salir = false;
		int opcion;
		do {
			System.out.println("Menú Principal");
			System.out.println("1 - Nuevo Contacto");
			System.out.println("2 - Buscar Contacto");
			System.out.println("9 - Salir");
			System.out.print(">");
			
			opcion = tec.nextInt();
			tec.nextLine();
			switch (opcion) {
			case 1:
				nuevo();
				break;
			case 2:
				buscar();
				break;
			case 9:
				salir = true;
				break;
			}
		
		} while(!salir);
	}
	
	private void nuevo() {
		System.out.println("\n\nNuevo Contacto");
		System.out.println("Ingresa los datos del nuevo Contacto");
		System.out.println("Nombre: ");
		String nom = tec.nextLine();
		System.out.println("Apodo: ");
		String apodo = tec.nextLine();
		
		Contacto nuevo = new Contacto();
		nuevo.setNombre(nom);
		nuevo.setApodo(apodo);
		neg.insetarContacto(nuevo);
				
	}
	private void buscar() {
		for (Contacto c : neg.buscarTodos()) {
			System.out.println(c);
		}
	}
}
