package bbdd;

import java.util.List;

public interface CampanyaDao {

	public void insert(List<String[]> datosCamp);
	
	public void insert(String[] datoCamp);
	
	public void prueba();
	
	
	// De hacer una aplicacion seria
	
	// public void insert(Campanya c);
	// public void insert(List<Campanya> c);
	
}
