package sintaxis;

public class TipoDato {
	public static void main(String[] args) {
		
		int i = Integer.MAX_VALUE;
		
		long l = i;
		
		float f = l;
		
		double d = l;
		
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		
		l = Long.MAX_VALUE;
		f = l;
		d = l;
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		
	}
}
