package hilos;

public class Hilos1 {
	
	private String mensaje;
	
	public Hilos1(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public void run() {
		while(true)
			System.out.println(mensaje);
	}
	public static void main(String[] args) {
		Hilos1 h1 = new Hilos1("Soy el hilo unoooooooooooooooo");
		h1.run();
		Hilos1 h2 = new Hilos1("Soy el hilo DOS");
		h2.run();
		Hilos1 h3 = new Hilos1("Soy el hilo unoooooooooooooooo");
		h3.run();
	}
}
