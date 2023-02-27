package excepciones;

import java.io.IOException;

public class E04 {
	
	public static void main(String[] args) {
		
		
		try {
			metodoProblematico();
			metodoProblematico();
			metodoProblematico();
			metodoProblematico();
			System.out.println("rara vez se ejecutara");
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
	public static void metodoProblematico() throws IOException{
		double num =  Math.random();
		if(num > 0.5) {
			System.out.println("Todo funciona ok");
		} else {
			throw new IOException("Tuvimos mala suerte!!!");
		}
	}
}
