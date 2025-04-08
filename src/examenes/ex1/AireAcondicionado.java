package examenes.ex1;

public class AireAcondicionado extends Mando implements Velocidad {

	enum Modo {
		FRIO,CALIENTE
	}
	
	private Modo modo;
	private double temperatura;
	private int velocidad = 0;
	
	public AireAcondicionado(String modelo, double anchura, double altura, double precio) {
		super(modelo, anchura, altura, precio);
	}

	@Override
	public boolean subirVelocidad() {
		boolean exito = false;
		if (this.velocidad < 5) {
			this.velocidad++;
		}
		return exito;
	}

	@Override
	public boolean bajarVelocidad() {
		boolean exito = false;
		if (this.velocidad > 0) {
			this.velocidad--;
		}
		return exito;
	}

	@Override
	public void mostrarVelocidad() {
		System.out.println(this.velocidad);
	}

}
