package parteuno.ejercuatro;

public class Electrodomestico {

	enum Color {
		BLANCO, NEGRO, ROJO, AZUL ,GRIS
	}
	enum ConsumoEnergetico {
		A ,B ,C ,D ,E ,F
	}
	private int precioBase = 100;
	private Color color = Color.BLANCO;
	private ConsumoEnergetico consumoEnergetico = ConsumoEnergetico.F;	
	private double peso = 5;
	
	public Electrodomestico (int precio, double peso) {
		this.precioBase = precio;
		this.peso = peso;
	}
	
	public Electrodomestico (int precio, double peso, String color, char consumoEnergetico) {
		this.precioBase = precio;
		this.peso = peso;
		compruebaColor(color);
		compruebaConsumo(consumoEnergetico);
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public ConsumoEnergetico getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(ConsumoEnergetico consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPrecioBase() {
		return precioBase;
	}
	
	public void setPrecioBase(double precio) {
		this.precioBase = (int) precio;
	}

	public double getPeso() {
		return peso;
	}

	private void compruebaColor(String color) {
		color = color.toUpperCase();
		switch (color) {
		case "BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS" -> {
			this.color = Color.valueOf(color.toUpperCase());
		}
		}
	}

	private void compruebaConsumo(char consumo) {
		String carac = Character.toString(consumo);
		switch (carac) {
		case "A", "B", "C", "D", "E", "F" -> {
			this.consumoEnergetico = consumoEnergetico.valueOf(carac);
		}
		}
	}
	
	public void precioFinal () {
		int precio = this.precioBase;
		switch (String.valueOf(color)) {
		case "A" -> {
			precio += 100;
		}
		case "B" -> {
			precio += 80;
		}
		case "C" -> {
			precio += 60;
		}
		case "D" -> {
			precio += 50;
		}
		case "E" -> {
			precio += 30;
		}
		case "F" -> {
			precio += 10;
		}
		}
		
		if (this.peso <= 19) {
			precio += 10;
		} else if (this.peso <= 49) {
			precio += 50;
		} else if (this.peso <= 79) {
			precio += 80;
		} else {
			precio += 100;
		}

		this.precioBase = precio;
	}
	
	@Override
	public String toString() {
		return this.precioBase + " " + this.color + " " + this.consumoEnergetico + " " + this.peso;
	}
}
