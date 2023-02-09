package colecciones.listas;

public class ListaEnlazada implements Lista {
	
	private Nodo primero;
	private Nodo ultimo;
	private int cantidad;
	
	
	@Override
	public void agregar(String dato) {
		Nodo nuevo = new Nodo(dato);
		if (ultimo!=null) {
			ultimo.proximo = nuevo;
			ultimo = nuevo;
		} else {
			primero = nuevo;
		}
		ultimo = nuevo;
		cantidad++;
	}

	@Override
	public String eliminar(int pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String buscar(int pos) {
		if(pos < cantidad && pos >= 0) {
			Nodo aux = primero;
			for (int i = 0; i < pos; i++) {
				aux = aux.proximo;
			}
			return aux.dato;
		} else {
			return null;
		}
	}

	@Override
	public boolean estaVacia() {
		return cantidad == 0;
	}

	@Override
	public int tamanyo() {
		return cantidad;
	}
	
	private class Nodo{
		String dato;
		Nodo proximo;
		
		public Nodo(String dato) {
			this.dato = dato;
		}
		@SuppressWarnings("unused")
		public Nodo(String dato, Nodo proximo) {
			this(dato);
			this.proximo = proximo;
		}
	}

}
