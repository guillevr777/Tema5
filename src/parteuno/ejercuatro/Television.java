package parteuno.ejercuatro;

public class Television extends Electrodomestico {

	private int resolucion = 20;
	private boolean sintonizadorTDT = false;
	
	public Television(int precio, double peso) {
		super(precio, peso);
	}
	
	public Television(int precio, double peso, String color, char consumoEnergetico, int resolucion, boolean sintonizadorTDT) {
		super(precio, peso, color, consumoEnergetico);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	public int getResolucion() {
		return resolucion;
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}
	
	public void precioFinal () {
		int precio = 0;
		super.precioFinal();
		precio = (int) getPrecioBase();
		if (resolucion > 40) {
			precio += getPrecioBase()*0.3;
		}
		if (sintonizadorTDT != false) {
			precio += 50;
		}
	}
}
