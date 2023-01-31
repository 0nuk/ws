package cadenas;

public class Replace {
	public static void main(String[] args) {
		String s = "holaaa    que      tal";
		System.out.println(s);
		
		System.out.println(s.replace(" ", ""));
		System.out.println(s.replaceAll(" ", ""));
		
		System.out.println(s.replace(" ", " "));
		
		String nuevo = s.replaceAll(" +", " ").replaceAll("[aeiouAEIOU]", "");
		System.out.println(nuevo);
		

	}
}
