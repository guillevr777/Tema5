package parteuno.ejercuatro;

public class Lavadora extends Electrodomestico {

	private int carga;
	
	public Lavadora(int precio, double peso) {
		super(precio, peso);
	}
	
	public Lavadora(int precio, double peso, String color, char consumoEnergetico, int carga) {
		super(precio, peso, color, consumoEnergetico);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	public void precioFinal () {
		int precio;
		super.precioFinal();
		precio = (int) this.getPrecioBase();
		if (this.carga > 30) {
			precio += 50;
		}
		this.setPrecioBase(precio);
	}
}
	