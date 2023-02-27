package excepciones;

import java.util.Scanner;

public class E06 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int retirar;
		do {
				retirar = Integer.parseInt(sc.nextLine());
			try {
				retirarSaldo(retirar);
				System.out.println("RETIRADO");
			} catch (SaldoInsuficienteException e) {
				System.out.println("SALDO INSUFICIENTE");
			} finally {
				System.out.println("GRACIAS!");
			}
			} while(retirar != 0);
	}
	
	public static void retirarSaldo(int cant) throws SaldoInsuficienteException {
		int saldo = 20;
		if (saldo < cant) {
			throw new SaldoInsuficienteException();
		}
	}
}
