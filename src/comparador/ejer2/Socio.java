package comparador.ejer2;

public class Socio {

	private int id;
	private String nombre;
	private int edad;
	
	public Socio (int id, String nombre, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	@Override
	public String toString () {
		return this.id + " " + this.nombre + " " + this.edad;
	}
}	