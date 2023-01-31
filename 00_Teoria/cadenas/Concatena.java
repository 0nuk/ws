package cadenas;

public class Concatena {
	
	public static void main(String[] args) {
		String s = "";
		StringBuilder sb = new StringBuilder("");
		StringBuffer sbf = new StringBuffer("");
		long t0, tf;
		
		t0 = System.currentTimeMillis();
		for(int i=1; i<=250_000; i++) {
			s += "a";
		}
		tf = System.currentTimeMillis();
		System.out.println("String: " + (tf-t0));
		
		t0 = System.currentTimeMillis();
		for(int i=1; i<=10_000_000; i++) {
			sb.append("a");
		}
		tf = System.currentTimeMillis();
		System.out.println("StringBuilder: " + (tf-t0));
		System.out.println(sb.length());
		
		t0 = System.currentTimeMillis();
		for(int i=1; i<=10_000_000; i++) {
			sbf.append("a");
		}
		tf = System.currentTimeMillis();
		System.out.println("StringBuffer: " + (tf-t0));
		
	}
}
