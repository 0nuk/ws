package agenda.persistencia;

import java.io.IOException;

import agenda.negocio.Agenda;
import agenda.negocio.AgendaImpl;

public class TestNegocio  {
	public static void main(String[] args) throws IOException   {
		Agenda agenda = new AgendaImpl();
		
		agenda.importarCSV("/curso/contactos.csv");
	}
}
