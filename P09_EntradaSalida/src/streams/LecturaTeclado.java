package streams;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LecturaTeclado {

	public static void main(String[] args) throws IOException {
//		System.out.println("Hola");
//		System.err.println("Hola");
		int entrada;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			entrada = Integer.parseInt(br.readLine());
			System.out.println(entrada);
		}while(entrada != 0);
	}
}
