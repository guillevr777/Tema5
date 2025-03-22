package parteuno.ejertres;

public class NoPerecedero extends Producto{
	
	private String tipo;

	public NoPerecedero(double precio, String nombre, String tipo) {
		super(precio, nombre);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String toString () {
		String producto;
		producto = super.toString();
		producto += " Tipo:" + this.tipo;
		return producto;
	}
}
