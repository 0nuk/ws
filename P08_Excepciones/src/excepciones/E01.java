package excepciones;

public class E01 {
	public static void main(String[] args) {
		metodoF(1); 
		metodoF(577); 
	}
	
	public static void metodoF(int indice) {
		try {
			System.out.println("recibido " + indice);
			metodoX(indice);
			System.out.println("procesado " + indice);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
	
	public static void metodoX(int indice) throws ArrayIndexOutOfBoundsException {
		int[] a = {1, 2, 3};
		System.out.println(a[indice]);
	}
}
