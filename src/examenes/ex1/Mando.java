package examenes.ex1;

public class Mando implements Comparable<Mando>{

	private String modelo;
	private double anchura;
	private double altura;
	private double precio;
	private boolean encendido = false;
	
	public Mando(String modelo, double anchura, double altura) throws ModeloException {
		if (modelo != null && !modelo.isBlank()) {
			this.modelo = modelo;
		} else {
			throw new ModeloException();
		}
			this.anchura = anchura;
			this.altura = altura;
	}
	
	public Mando(String modelo, double anchura, double altura, double precio) throws ModeloException, PrecioException {
		if (modelo != null && !modelo.isBlank()) {
			this.modelo = modelo;
		} else {
			throw new ModeloException();
		}
			this.anchura = anchura;
			this.altura = altura;
		if (precio > 0) {
			this.precio = precio;
		} else {
			throw new PrecioException();
		}
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
