package analisis.ejer1;

public class Turismo extends Vehiculo{

	enum TipoUso {PROFESIONAL, PARTICULAR};
	
	private int numAsientos;
	private TipoUso uso;
	
	public Turismo(String marca, String modelo, String color, String matricula, int numAsientos, String uso) {
		super(marca, modelo, color, matricula);
		this.numAsientos = numAsientos;
		verificaTipo(uso);
	}

	private void verificaTipo(String uso) {
		if (uso != null && !uso.isBlank()) {
			switch (uso) {
			case "PROFESIONAL","PARTICULAR" -> {
				this.uso = TipoUso.valueOf(uso);
				}
			}
		}
	}

	public int getNumAsientos() {
		return numAsientos;
	}

	public void setNumAsientos(int numAsientos) {
		this.numAsientos = numAsientos;
	}

	public void setUso(TipoUso uso) {
		this.uso = uso;
	}
	
	@Override
	public String toString () {
		return super.toString() + "\nNumero asientos : " + this.numAsientos + " Uso : " + this.uso;
	}
}
