package analisis.ejer4;

public class Agenda {
	
	private String nombre;
	private int telefono;
	
	public Agenda (String nombre, int telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	public String toString () {
		return "Nombre: " + this.nombre + " Telefono: " + this.telefono;
	}
}
