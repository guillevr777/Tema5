package parteuno.ejerdos;

public class Empleado {

	private String nombre;
	
	public Empleado (String nombre) {
		this.nombre = nombre;
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre () {
		return this.nombre;
	}
	
	public String toString () {
		return "Empleado" + this.nombre;
	}
 }
