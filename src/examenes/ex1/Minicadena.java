package examenes.ex1;

public class Minicadena extends Mando implements Volumen{

	private int volumen;
	
	public Minicadena(String modelo, double anchura, double altura, double precio) {
		super(modelo, anchura, altura, precio);
	}

	@Override
	public boolean subirVolumen() {
		boolean exito = false;
			if (volumen <= 90) {
				this.volumen += 10;
			}
		return exito;
	}

	@Override
	public boolean bajarVolumen() {
		boolean exito = false;
		if (volumen >= 10) {
			this.volumen -= 10;
		}
	return exito;
	}

	@Override
	public void mostrarVolumen() {
		System.out.println(this.volumen);
	}

}
