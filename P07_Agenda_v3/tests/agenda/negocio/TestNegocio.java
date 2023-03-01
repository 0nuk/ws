package agenda.negocio;

import java.io.IOException;

public class TestNegocio  {
	public static void main(String[] args) throws IOException   {
		Agenda agenda = new AgendaImpl();
		
		agenda.importarCSV("/curso/contactos.csv");
	}
}
