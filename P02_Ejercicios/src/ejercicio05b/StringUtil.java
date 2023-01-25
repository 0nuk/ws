// 22. Desarrollar una Clase StringUtil, que implemente los siguientes métodos:
// a. public static String insert(String cadena, String insertado, int pos)
// b. public static String delete(String cadena, int desde, int hasta)
// c. public static int indexOf(String cadena, String buscado)
// d. public static String replace(String cadena, String buscado, String reemplazo)
// e. public static String capitalize(String cadena)
// f. public static int cuentaPalabras(String cadena)
// g. public static int cuentaParrafos(String cadena)

package ejercicio05b;

public class StringUtil {
	public static void main(String[] args) {
		System.out.println(insert("hola como estas", " kuno", 4));
		System.out.println(delete("hola como estas", 5, 9));
		System.out.println(indexOf("hola como estas", "como"));
		System.out.println(replace("hola como estas", "hola", "chau"));
		System.out.println(capitalize("holA cOmo eStas"));
		System.out.println(cuentaPalabras(" hola     como estas, espero que muy bien "));
		String texto = """
En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor. 
Una olla de algo más vaca que carnero, salpicón las más noches, duelos y quebrantos los sábados, lantejas los viernes, algún palomino de añadidura los domingos, consumían las tres partes de su hacienda. 
El resto della concluían sayo de velarte, calzas de velludo para las fiestas, con sus pantuflos de lo mesmo, y los días de entresemana se honraba con su vellorí de lo más fino. 
Tenía en su casa una ama que pasaba de los cuarenta, y una sobrina que no llegaba a los veinte, y un mozo de campo y plaza, que así ensillaba el rocín como tomaba la podadera.
Frisaba la edad de nuestro hidalgo con los cincuenta años; era de complexión recia, seco de carnes, enjuto de rostro, gran madrugador y amigo de la caza. 
Quieren decir que tenía el sobrenombre de Quijada, o Quesada, que en esto hay alguna diferencia en los autores que deste caso escriben; aunque por conjeturas verosímiles se deja entender que se llamaba Quijana. 
Pero esto importa poco a nuestro cuento: basta que en la narración dél no se salga un punto de la verdad.
Es, pues, de saber que este sobredicho hidalgo, los ratos que estaba ocioso, que eran los más del año, se daba a leer libros de caballerías, con tanta afición y gusto,
que olvidó casi de todo punto el ejercicio de la caza, y aun la administración de su hacienda; y llegó a tanto su curiosidad y desatino en esto, que vendió muchas hanegas de tierra de sembradura para comprar libros de caballerías en que leer, 
y así, llevó a su casa todos cuantos pudo haber dellos; y de todos, ningunos le parecían tan bien como los que compuso el famoso Feliciano de Silva; porque la claridad de su prosa y aquellas entricadas razones suyas le parecían de perlas, y más cuando llegaba a leer aquellos requiebros y cartas de desafíos, donde en muchas partes hallaba escrito: 
«La razón de la sinrazón que a mi razón se hace, de tal manera mi razón enflaquece, que con razón me quejo de la vuestra fermosura». Y también cuando leía: «... los altos cielos que de vuestra divinidad divinamente con las estrellas os fortifican, y os hacen merecedora del merecimiento que merece la vuestra grandeza».
Con estas razones perdía el pobre caballero el juicio, y desvelábase por entenderlas y desentrañarles el sentido, que no se lo sacara ni las entendiera el mesmo Aristóteles, si resucitara para sólo ello. 
No estaba muy bien con las heridas que don Belianís daba y recebía, porque se imaginaba que, por grandes maestros que le hubiesen curado, no dejaría de tener el rostro y todo el cuerpo lleno de cicatrices y señales. 
Pero, con todo, alababa en su autor aquel acabar su libro con la promesa de aquella inacabable aventura, y muchas veces le vino deseo de tomar la pluma y dalle fin al pie de la letra, como allí se promete; y sin duda alguna lo hiciera, y aun saliera con ello, si otros mayores y continuos pensamientos no se lo estorbaran. 
Tuvo muchas veces competencia con el cura de su lugar (que era hombre docto, graduado en Sigüenza), sobre cuál había sido mejor caballero: Palmerín de Ingalaterra, o Amadís de Gaula; mas maese Nicolás, barbero del mismo pueblo, decía que ninguno llegaba al Caballero del Febo, y que si alguno se le podía comparar, era don Galaor, hermano de Amadís de Gaula, porque tenía muy acomodada condición para todo; 
que no era caballero melindroso, ni tan llorón como su hermano, y que en lo de la valentía no le iba en zaga.
								""";
		System.out.println(cuentaParrafos(texto));
	}
	public static String insert(String cadena, String insertado, int pos) {
		cadena =  cadena.substring(0, pos) + insertado + cadena.substring(pos, cadena.length());
		return cadena;
	}
	public static String delete(String cadena, int desde, int hasta) {
		cadena =  cadena.substring(0, desde) + cadena.substring(hasta, cadena.length());
		return cadena;	
	}
	public static int indexOf(String cadena, String buscado) {
		return cadena.indexOf(buscado);			
	}
	public static String replace(String cadena, String buscado, String reemplazo) {
		return cadena.replaceAll(buscado, reemplazo);
	}
	public static String capitalize(String cadena) {
		cadena = cadena.trim().toLowerCase();
		String cadenaMod = cadena.toUpperCase().charAt(0) + "";
		for(int i = 1; i < cadena.length(); i++) {
			cadenaMod += cadena.charAt(i);
			if (cadena.charAt(i) == ' ') {
				cadenaMod += cadena.toUpperCase().charAt(i+1);
				i++;
			}	
		}
		return cadenaMod;
	}
	public static int cuentaPalabras(String cadena) {
		int cont = 0; 
		cadena = " " + cadena.trim().replaceAll(" +", " ");
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == ' ') {
				cont++;
			}
		}
		return cont;
	}
	public static int cuentaParrafos(String cadena) {
		int cont = 0; 
		cadena = "\n" + cadena.trim().replaceAll("\n+", "\n");
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == '\n') {
				cont++;
			}
		}
		return cont;
	}
}
