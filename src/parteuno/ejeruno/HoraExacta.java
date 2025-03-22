package parteuno.ejeruno;

public class HoraExacta extends Hora{

	private int segundos;
	
	public HoraExacta(int hora, int minuto ,int segundos) {
		super(hora, minuto);
		if (segundos > 0 && segundos <= 59) {
			this.segundos = segundos;
		}
	}

	public int getSegundos() {
		return segundos;
	}

	public boolean setSegundos(int segundos) {
		boolean exito = false;
		if (segundos > 0 && segundos <= 59) {
		this.segundos = segundos;
		exito = true;
		}
		return exito;
	}
	
	public void inc () {
		if (this.segundos == 59) {
			this.segundos = 0;

			super.inc();

		} else {
			this.segundos += 1;
		}
	}
 	
	public String toString () {
		String cadena = "";

		cadena = super.toString();

		if (segundos < 9) {
			cadena += ":0" + segundos;
		} else {
			cadena += ":" + segundos + "";
		}

		return cadena;
	}
	
}
