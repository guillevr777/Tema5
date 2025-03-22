package parteuno.ejeruno;

public class Hora {

	private int minuto;
	private int hora;
	
	public Hora (int hora, int minuto) {
		this.hora = hora;
		this.minuto = minuto;
	}
	
	//getters y setters
	public int getMinuto() {
		return minuto;
	}
	
	public boolean setMinuto(int minuto) {
		boolean exito = false;
		if (minuto > 0 && minuto <= 59) {
		this.minuto = minuto;
		exito = true;
		}
		return exito;
	}
	
	public int getHora() {
		return hora;
	}
	
	public boolean setHora(int hora) {
		boolean exito = false;
		if (minuto > 0 && minuto <= 23) {
		this.hora = hora;
		exito = true;
		}
		return exito;
	}
	
	public void inc () {
		if (hora >= 23 && minuto >= 59) {
			hora = 0;
			minuto = 0;
		} else if (hora <= 23 && minuto <= 58) {
			minuto++;
		} else if (minuto == 59 && hora < 23) {
			minuto = 0;
			hora++;
		}
	}
	
	public String toString() {
		if (this.minuto >= 10) {
		return this.hora + ":" + this.minuto;
		} else {
			return this.hora + ":0" + this.minuto;
		}
	}
}
