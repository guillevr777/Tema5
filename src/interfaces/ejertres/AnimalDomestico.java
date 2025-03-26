package interfaces.ejertres;

abstract class AnimalDomestico implements Animal {

	private String nombre;
	private String raza;
	private int peso; 
	private String color;
	
	public AnimalDomestico(String nombre, String raza, int peso, String color) {
		this.nombre = nombre;
		this.raza = raza;
		this.peso = peso;
		this.color = color;
	}
	
	public void vacunar () {	
		System.out.println("Va a doler...");
	}
	
	@Override
	public void comer() {
		System.out.println("A comer?");
	}
	
	@Override
	public void dormir() {
		System.out.println("A comer?");
	}
	
	@Override
	public abstract void hacerRuido();
	
	public abstract boolean hacerCaso ();
}
