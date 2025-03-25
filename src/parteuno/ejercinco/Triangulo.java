package parteuno.ejercinco;

public class Triangulo extends Poligono{

	private int a;
	private int b;
	private int c;
	
	public Triangulo( int a, int b, int c) {
		super(3);
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double area () {
		double semiPerimetro = (a+b+c)/2;
        double area = Math.sqrt(semiPerimetro * (semiPerimetro - a) * (semiPerimetro - b) * (semiPerimetro - c));
        return area;
	}
	
	public String toString () {
		String frase = super.toString() + " Area : " + area();
		return frase;
	}
}
