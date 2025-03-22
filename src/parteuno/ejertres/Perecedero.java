package parteuno.ejertres;

public class Perecedero extends Producto{

	private int diasACaducas;

	public Perecedero(double precio, String nombre, int diasACaducar) {
		super(precio, nombre);
		this.setDiasACaducas(diasACaducar);
	}

	public int getDiasACaducas() {
		return diasACaducas;
	}

	public void setDiasACaducas(int diasACaducas) {
		this.diasACaducas = diasACaducas;
	}
	
	public double calcular(int cant) {
		double resultado;
		resultado = super.calcular(cant);
		if (diasACaducas == 1) {
			resultado = resultado / 4;
		} else if (diasACaducas == 2) {
			resultado = resultado / 3;
		} else if (diasACaducas == 3) {
			resultado = resultado / 2;
		}
		return resultado;
	}

	public String toString () {
		String producto;
		producto = super.toString();
		producto += " Dias a Caducar:" + this.diasACaducas;
		return producto;
	}
}
