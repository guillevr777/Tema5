package examenes.ex1;

public class Aspiradora extends Mando implements Velocidad{

	private int velocidad = 0;
	
	public Aspiradora(String modelo, double anchura, double altura, double precio) {
		super(modelo, anchura, altura, precio);
	}

	@Override
	public boolean subirVelocidad() {
		boolean exito = false;
		if (this.velocidad < 3) {
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
