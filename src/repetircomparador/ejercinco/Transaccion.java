package repetircomparador.ejercinco;

public class Transaccion implements Comparable<Transaccion>{

	private int dia;
	private int mes;
	private int año;
	private String concepto;
	protected double importe;
	
	public Transaccion (int dia, int mes, int año, String concepto, double importe) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
		this.concepto = concepto;
		this.importe = importe;
	}

	@Override
	public String toString () {
		String frase;
		
		frase = "\nFecha:" + this.dia + "/" + this.mes + "/" + this.año + "\tConcepto:" + this.concepto;
		
		return frase;
	}
	
	@Override
	public int compareTo(Transaccion o) {
		return Double.compare(this.importe, o.importe);
	}
}
