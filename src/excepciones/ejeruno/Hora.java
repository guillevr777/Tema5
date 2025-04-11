package excepciones.ejeruno;

public class Hora {

	private int segundo;
	private int minuto;
	private int hora;
	
	//Constructores
	public Hora (int segundo) {
		this.segundo = segundo;
	}
	public Hora (int hora, int minuto, int segundo) throws HoraException {
		if (hora >= 0 || hora <= 23) {
			this.hora = hora;
		} else {
			throw new HoraException();
		}
			this.minuto = minuto;
			this.segundo = segundo;
	}
	
	//getters y setters
	public int getSegundo() {
		return segundo;
	}
	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public String toString() {
		return this.hora + ":" + this.minuto + ":" + this.segundo;
	}
}
