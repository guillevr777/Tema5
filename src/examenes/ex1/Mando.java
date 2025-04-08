package examenes.ex1;

public class Mando implements Comparable<Mando>{

	private String modelo;
	private double anchura;
	private double altura;
	private double precio;
	private boolean encendido = false;
	
	public Mando(String modelo, double anchura, double altura, double precio) {
		this.modelo = modelo;
		this.anchura = anchura;
		this.altura = altura;
		this.precio = precio;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	public String getModelo() {
		return modelo;
	}

	public double getAnchura() {
		return anchura;
	}

	public double getAltura() {
		return altura;
	}

	public double getPrecio() {
		return precio;
	}
	
	@Override
	public boolean equals (Object obj) {
		boolean iguales = false;
		Mando mando = (Mando) obj;
		if (mando.getModelo().equals(this.getModelo())) {
			iguales = true;
		}
		return iguales;
	}
	
	@Override
	public String toString () {
		return "Modelo : " + this.modelo + "\t" + (this.encendido ? "Encendido" : "Apagado");
	}

	@Override
	public int compareTo(Mando o) {
	    return this.modelo.compareTo(o.getModelo());
	}
 }
