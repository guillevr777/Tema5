package repetircomparador.ejercinco;

import java.util.Comparator;
import java.util.TreeSet;

public class Cuenta implements Comparator<Cuenta>{

	private int numCuenta;
	protected double saldo;
	private TreeSet<Titular> titulares;
	
	public Cuenta (int numCuenta, double saldo, Titular titular) {
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		this.titulares = new TreeSet<Titular>();
		if (titular != null) {
			añadirTitular (titular);
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public boolean ingresar(double saldo) {
		boolean exito = false;
		
		if (saldo > 0) {
			this.saldo += saldo;
			exito = true;
		}
		
		return false;
	}
	
	public boolean retirar(double saldo) {
		boolean exito = false;
		
		if (saldo > 0 && (this.saldo - saldo > 0)) {
			this.saldo -= saldo;
			exito = true;
		}
		
		return false;
	}
	
	public boolean añadirTitular(Titular titular) {
		boolean exito = false;
		
		if (titulares.size() < 3) {
			titulares.add(titular);
			exito = true;
		}
		
		return exito;
	}
	
	public boolean borrarTitular(Titular titular) {
		boolean exito = false;
		
		if (titulares.contains(titular)) {
			titulares.remove(titular);
			exito = true;
		}
		
		return exito;
	}
	
	@Override
	public String toString () {
		String frase;
		
		frase = "NºCuenta:" + this.numCuenta + "\tSaldo:" + this.saldo;
		
		return frase;
	}

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		return Integer.compare(o1.numCuenta, o2.numCuenta);
	}
}
