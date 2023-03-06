package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class ServerEchoRunnable {
	
	private int puerto = 23;
	
	public ServerEchoRunnable() {
		iniciar();
		
	}
	
	public ServerEchoRunnable(int puerto) {
		this.puerto = puerto;
		iniciar();
	}
	
	public static void main(String[] args) {
		new ServerEchoRunnable();
	}
	
	private void iniciar() {
		try(ServerSocket server = new ServerSocket(puerto)){
			System.out.println("Socket abierto en el puerto " + puerto);
			System.out.println("Esperando conexiones...");
			while(true) {
				Socket cli = server.accept(); 
				new AtiendeCliente(cli);
			}
			
		} catch (IOException e) {
			System.err.println("No se pudo abrir el puerto " + puerto);
			e.printStackTrace();
		}
	}
	
	private class AtiendeCliente implements Runnable{
		private Socket socket;
		private String nick;
		private PrintWriter out;
		
		private static int cant;
		private static Map<String, AtiendeCliente> sala = new HashMap<>();
		
		AtiendeCliente(Socket socket){
			this.socket = socket;
			Thread t = new Thread(this);
			t.start();
		}
		
		public void run() {
			log("Nuevo cliente conectado");
			
			try(PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
				BufferedReader in = new BufferedReader(
						new InputStreamReader(socket.getInputStream()))) {
				
				out = pw;
				out.println("Hola... Bienvenido a Guasa!!!");
				out.println("Por favor, identificate");
				nick = in.readLine();
				out.println(nick + " ya estas en Guasa");
				sala.put(nick, this);
				cant++;
				log(nick + " se ha conectado");
				log(cant + " de usuarios en la sala");
				difusion("SRV: " + nick + " se ha conectado");
				
				String leido;
				boolean sesion = true;
				
				while((leido = in.readLine()) != null && sesion) {
					if (leido.charAt(0) == '@') {
						String nickDest = leido.substring(1, leido.indexOf(' '));
						String mensaje = leido.substring(leido.indexOf(' ') + 1);
						if(sala.containsKey(nickDest)) {
							sala.get(nickDest).out.println("PRIVADO de " + nick + ": " + mensaje);
							log(nick + "envió: " + mensaje + " a " + nickDest);
						} else {
							out.println("SRV: " + nickDest + " no esta conectadp");
						}
					} else {
						
						switch(leido.toLowerCase()) {
						case "quit":
						case "salir":
						case "adios":
							sesion = false;
							out.println("Hasta la vista Baby!!!");
							sala.remove(nick);
							cant--;
							difusion("SRV: " + nick + " se ha desconectado" );
							difusion(nick + " se ha desconectado");
							break;
						case "who":
						case "quien":
						case "quienes":
							for (AtiendeCliente cliente : sala.values()) {
								cliente.out.println("SRV: " + cliente.nick);
							}
							break;
						case "?":
						case "help":
						case "sos":
						case "ayuda":
							out.println("Ayuda de Guasa");
							out.println("quit: para terminar sesion");
							out.println("who: consultar usuarios en la sala");
							out.println("@Usuario mensaje: para mandar mensajes privados");
							break;
						default: 
							difusion(nick + ": " + leido);
							log(nick + ": " + leido);					
						}
					}
				}
			} catch (IOException e) {
				log("Error de lectura");
			}
		}
		
		private void log(String msj) {
			System.out.println(msj);
		}
		
		private void difusion(String msj) {
			for (AtiendeCliente cli : sala.values()) {
				cli.out.println(msj);
			}
		}
	}
}
