package analisis.ejer3;

import java.util.TreeSet;

public class CuentaCorriente extends Cuenta {

	private TreeSet<Transaccion> transacciones;
	private int porcentajeCobrado;
	private int numTransacciones;
	
	public CuentaCorriente(int numCuenta, double saldo, Titular titular, int porcentajeCobrado, int numTransacciones) {
		super(numCuenta, saldo, titular);
		this.numTransacciones = numTransacciones;
		this.porcentajeCobrado = porcentajeCobrado;
		this.transacciones = new TreeSet<>();
	}
	
	public boolean nuevaTransaccion(Transaccion transaccion) {
		boolean exito = false;
		
		if (transaccion != null) {
			exito = true;
			Transaccion t = transaccion;
			
			t.importe = t.importe + (t.importe * porcentajeCobrado);
			
			transacciones.add(t);
			this.numTransacciones++;
		}
		
		return exito;
	}
	
	public void transacciones () {
		for (Transaccion t: transacciones) {
			System.out.println(t);
		}
	}

	@Override
	public String toString() {
	    String texto = super.toString() + "\n";
	    texto += "Porcentaje cobrado: " + this.porcentajeCobrado +
	             " | Número de transacciones: " + this.numTransacciones + "\n";

	    texto += "Transacciones:\n";
	    for (Transaccion t : transacciones) {
	        texto += "  → " + t.toString() + "\n";
	    }

	    return texto;
	}

}
