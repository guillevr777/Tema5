package analisis.ejer3;

public class CuentaAhorro extends Cuenta {
	
	private double cuotaMantenimiento;
	private double interesAnual;

	public CuentaAhorro(int numCuenta, double saldo, Titular titular, double cuotaMantenimiento, double interesAnual) {
		super(numCuenta, saldo, titular);
		this.cuotaMantenimiento = cuotaMantenimiento;
		this.interesAnual = interesAnual;
	}

	public double saldoNuevo() {
		double sueldoNuevo;
		sueldoNuevo = this.saldo - (this.saldo * interesAnual);
		return sueldoNuevo;
	}
	
	public double restarCuota() {
		double sueldoNuevo;
		sueldoNuevo = this.saldo - cuotaMantenimiento;
		return sueldoNuevo;
	}
	
	@Override
	public String toString () {
		String frase;
		
		frase = super.toString() + "\nCuotaMantenimiento:" + this.cuotaMantenimiento + "\tInteresAnual:" + this.interesAnual;
		
		return frase;
	}
}
