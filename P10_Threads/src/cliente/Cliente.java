package cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
	private Socket socket;
	
	public Cliente(String host, int port) {
//		super();
		try {
			socket = new Socket(host, port);
			new ClienteIn(socket);
			new ClienteOut(socket);
		} catch (IOException e) {
			System.out.println("No se puede conecta a " + host + " en " + port);
		}
	}
	
	public Cliente(String host) {
		this(host, 23);
	}
	
	private class ClienteIn extends Thread {
		@SuppressWarnings("unused")
		private Socket socket;
		private BufferedReader in;
		
		public ClienteIn(Socket socket) {
			this.socket = socket;
			try {
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				start();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public void run() {
			String linea;
			try {
				while((linea = in.readLine()) != null) {
					System.out.println(linea);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		}
	public class ClienteOut extends Thread {
		@SuppressWarnings("unused")
		private Socket socket;
		private PrintWriter out;
		
		public ClienteOut(Socket socket) {
			this.socket = socket;
			try {
				out = new PrintWriter(socket.getOutputStream());
				start();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		public void run() {
			String leido;
			@SuppressWarnings("resource")
			Scanner tec = new Scanner(System.in);
			while(true) {
				leido = tec.nextLine();
				out.println(leido);
			}
		}
		
	}
}





