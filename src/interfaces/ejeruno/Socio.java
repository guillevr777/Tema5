package interfaces.ejeruno;

public class Socio implements Comparable<Socio> {

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
	
	@Override
	public int compareTo(Socio otro) {
		return Integer.compare(this.id, otro.id);
    }
}
