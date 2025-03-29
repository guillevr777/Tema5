package analisis.ejer1;

public class Motocicleta extends Vehiculo{

	private int cilindrada;
	
	public Motocicleta(String marca, String modelo, String color, String matricula, int cilindrada) {
		super(marca, modelo, color, matricula);
		this.cilindrada = cilindrada;
	}
	
	public int getCilindrada () {
		return this.cilindrada;
	}
	
	public boolean necesitaCarnet () {
		boolean necesita = false;
		
		if (this.cilindrada >= 125) {
			necesita = true;
		}
		
		return necesita;
	}
}
