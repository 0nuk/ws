package colecciones.listas;

public class ListaArray implements Lista{

	private String[] almacen;
	private int ultimo;
	
	public ListaArray() {
		almacen = new String[10];
		ultimo = 0;
	}
	public ListaArray(int tam) {
		almacen = new String[tam];
		ultimo = 0;
	}
	
	@Override
	public void agregar(String dato) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String eliminar(int pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String buscar(int pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean estaVacia() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int tamanyo() {
		// TODO Auto-generated method stub
		return 0;
	}

}
