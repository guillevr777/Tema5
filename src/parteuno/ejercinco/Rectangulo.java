package parteuno.ejercinco;

public class Rectangulo extends Poligono{

	private int lado1;
	private int lado2;

	public Rectangulo( int lado1, int lado2) {
		super(4);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public double area () {
		double calculo = lado1 * lado2;
		return calculo;
	}
	
	public String toString () {
		String frase = super.toString() + " Area : " + area();
		return frase;
	}
}
