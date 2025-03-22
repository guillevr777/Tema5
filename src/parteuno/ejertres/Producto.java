package parteuno.ejertres;

public class Producto {

	private double precio;
	private String nombre;
	
	public Producto (double precio, String nombre) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double calcular(int cant) {
		return cant * precio;
	}
	
	public String toString () {
		return "Nombre:" + this.nombre + " Precio:" + this.precio;
	}
}
