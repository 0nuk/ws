package esturcturascontrol;

public class BCondicionalMultiple {
	public static void main(String[] args) {
		
		int pivote = 21;
		
		switch (pivote) {
		case 1:
			System.out.println("Pivote vale 1");
			break;
		case 2:
			System.out.println("Pivote vale 2");
			break;
		case 3:
			System.out.println("Pivote vale 3");
			break;
		default:
			System.out.println("Pivote es distinto de 1, 2 o 3");
			break;
		}
	}
}
