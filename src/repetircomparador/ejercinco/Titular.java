package repetircomparador.ejercinco;

public class Titular implements Comparable<Titular>{

	private String dni;
	private String nombre;
	private String apellido;
	private int telefono;
	
	public Titular (String dni, String nombre, String apellido, int telefono) {
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	private String getDni() {
		return this.dni;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}
	
	@Override
	public String toString () {
		String frase;
		
		frase = "\nDni:" + this.dni + "\tNombre:" + this.nombre;
		
		return frase;
	}

	@Override
	public int compareTo(Titular o) {
		return this.dni.compareTo(o.getDni());
	}
}
