package analisis.ejer1;

public class Camion extends Vehiculo{

	private double pesoMaximo;
	private boolean mercanciaPeligrosa;
	
	public Camion(String marca, String modelo, String color, String matricula, boolean mercanciaPeligrosa, double pesoMaximo) {
		super(marca, modelo, color, matricula);
		this.mercanciaPeligrosa = mercanciaPeligrosa;
		this.pesoMaximo = pesoMaximo;
	}

	public double getPesoMaximo() {
		return pesoMaximo;
	}

	public boolean getMercanciaPeligrosa () {
		return mercanciaPeligrosa;
	}

	public void setMercanciaPeligrosa (boolean mercanciaPeligrosa) {
		this.mercanciaPeligrosa = mercanciaPeligrosa;
	}
	
	@Override
	public String toString () {
		return super.toString() + "\nMercancia Peligrosa : " + this.mercanciaPeligrosa + " Peso Maximo : " + this.pesoMaximo;
	}
}
