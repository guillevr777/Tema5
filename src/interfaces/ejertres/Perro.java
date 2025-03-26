package interfaces.ejertres;

import java.util.Random;

public class Perro extends AnimalDomestico {

	public Perro(String nombre, String raza, int peso, String color) {
		super(nombre, raza, peso, color);
	}
	
	public void sacarPaseo () {
		System.out.println("Vamonos a dar una vuelta.");
	}

	@Override
	public boolean hacerCaso() {
		Random random = new Random();
		boolean ladrido = false;
		
		if (random.nextInt(1,101) < 90) {
			ladrido = true;
		}
			
		return ladrido;
	}

	@Override
	public void hacerRuido() {
		System.out.println("Guau!");
	}
}
