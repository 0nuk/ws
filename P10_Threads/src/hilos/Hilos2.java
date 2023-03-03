package hilos;

public class Hilos2 implements Runnable{
	
	private String mensaje;
	
	public Hilos2(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public void run() {
		while(true) {			
			System.out.println(mensaje);
			for (int i = 0; i < 100000000; i++);
		}
			
		
	}
	public static void main(String[] args) {
		Hilos2 h1 = new Hilos2("|_|____________________________|__________________________|");
		Thread t1 = new Thread(h1);		
		t1.start();
		Hilos2 h2 = new Hilos2("|____|____________________________|________________________|");
		Thread t2 = new Thread(h2);
		t2.start();
		Hilos2 h3 = new Hilos2("|________|____________________________|____________________|");
		Thread t3 = new Thread(h3);
		t3.start();
		Hilos2 h4 = new Hilos2("|____________|____________________________|________________|");
		Thread t4 = new Thread(h4);
		t4.start();
		Hilos2 h5 = new Hilos2("|________________|____________________________|____________|");
		Thread t5 = new Thread(h5);
		t5.start();
		Hilos2 h6 = new Hilos2("|____________________|____________________________|________|");
		Thread t6 = new Thread(h6);
		t6.start();
		Hilos2 h7 = new Hilos2("|_______________________|____________________________|_____|");
		Thread t7 = new Thread(h7);
		t7.start();
		Hilos2 h8 = new Hilos2("|___________________________|____________________________|_|");
		Thread t8 = new Thread(h8);
		t8.start();
	}
}
