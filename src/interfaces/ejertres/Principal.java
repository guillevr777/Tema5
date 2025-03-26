package interfaces.ejertres;

public class Principal {

	public static void main(String[] args) {

		AnimalDomestico gato = new Gato("Maki", "Persa", 6, "Negro");
		AnimalDomestico perro = new Perro("Chica", "Galgo", 15, "Blanco");

		gato.comer();
		gato.dormir();
		gato.vacunar();
		perro.hacerRuido();
		System.out.println(perro.hacerCaso() + " " + gato.hacerCaso());

	}
}
