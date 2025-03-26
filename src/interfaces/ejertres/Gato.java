package interfaces.ejertres;

import java.util.Random;

public class Gato extends AnimalDomestico {

	public Gato(String nombre, String raza, int peso, String color) {
		super(nombre, raza, peso, color);
	}
	
	public void toserBolaPelo () {
		System.out.println("Que asquete.");
	}

	@Override
	public boolean hacerCaso() {
		Random random = new Random();
		boolean ladrido = false;
		
		if (random.nextInt(1,101) < 5) {
			ladrido = true;
		}
			
		return ladrido;
	}

	@Override
	public void hacerRuido() {
		System.out.println("Miau!");
	}
}
