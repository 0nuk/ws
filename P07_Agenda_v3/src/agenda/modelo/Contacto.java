package agenda.modelo;

import java.text.Collator;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

public class Contacto implements Comparable<Contacto> {

	private int idContacto;
	private String nombre;
	private String apellidos;
	private String apodo;
	private Domicilio dom;
	private Set<String> telefonos;
	private Set<String> correos;
		
	public Contacto() {
		dom = new Domicilio();
		telefonos =  new LinkedHashSet<>();
		correos =  new LinkedHashSet<>();
	}
	
	public Contacto(String nombre, String apodo) {
		this();
		this.nombre = nombre;
		this.apodo = apodo;
	}
	
	public int getIdContacto() {
		return idContacto;
	}

	public void setIdContacto(int idContacto) {
		this.idContacto = idContacto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public Domicilio getDom() {
		return dom;
	}

	public void setDom(Domicilio dom) {
		this.dom = dom;
	}

	public Set<String> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(Set<String> telefonos) {
		this.telefonos = telefonos;
	}

	public Set<String> getCorreos() {
		return correos;
	}

	public void setCorreos(Set<String> correos) {
		this.correos = correos;
	}
	
	public void addTelefonos(String... telefonos) {
		for (int i = 0; i < telefonos.length; i++) {
			this.telefonos.add(telefonos[i]);
		}
	}
	
	public void addTelefono(String telefono) {
		telefonos.add(telefono);
	}
	
	public void addCorreos(String... correos) {
		for (int i = 0; i < correos.length; i++) {
			this.correos.add(correos[i]);
		}
	}
	
	public void addCorreo(String correo) {
		correos.add(correo);
	}
	@Override
	public boolean equals(Object o) {
		if (o==null) return false;
		if (this==o) return true;
		if (o.getClass()!=this.getClass()) return false;
		Contacto otro = (Contacto)o;
		return this.idContacto == otro.idContacto;
	}
	
	@Override
	public int hashCode() {
		return idContacto;
	}

	@Override
	public String toString() {
		return " [" + idContacto + ", " + nombre + ", " + apellidos + ", " + apodo + "]";
	}
//	Compara ok independientemente de las mayusculas o minusculas
//	no ordena correctamnte los caracteres especiales á ñ
//	@Override
//	public int compareTo(Contacto o) {
//		return this.idContacto - o.idContacto;
//		if(this.equals(o)) return 0;
//		return  (this.nombre + this.idContacto).toLowerCase().compareTo((o.nombre + o.idContacto).toLowerCase());
//	}
	@Override
	public int compareTo(Contacto o) {
		if(this.equals(o)) return 0;
		Collator col = Collator.getInstance(new Locale("es"));
		
		return col.compare(this.nombre + this.idContacto, o.nombre + o.idContacto);
	}
	
	public static Comparator<Contacto> getComparatorId(){
		return new IdComparator();
	}
	
	private static class IdComparator implements Comparator<Contacto>{
		@Override
		public int compare(Contacto o1, Contacto o2) {
			return o1.getIdContacto()-o2.getIdContacto();
		}
	}	
}
