package sintaxis;

public class Escape {
	public static void main(String[] args) {
		String saludo = "\"Hola que tal\"";
		System.out.println(saludo);
		
		saludo = "Hola\tque\ttal";
		System.out.println(saludo);
		
		saludo = "Hola\nque\ntal\n";
		System.out.println(saludo);
		
		saludo = "\u2661";
		System.out.println(saludo);
		
		saludo = "c:\\tremendo\\nunca";
		System.out.println(saludo);
		
		char letra = '\'';
		System.out.println(letra);
		
	}
}
