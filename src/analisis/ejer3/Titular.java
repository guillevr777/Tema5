package analisis.ejer3;

public class Titular implements Comparable<Titular>{

	private String dni;
	private String nombre;
	private String apellidos;
	private int telefono;
	
	public Titular (String dni, String nombre, String apellido, int telefono) {
		this.dni = dni;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	private String getDni() {
		return this.dni;
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
