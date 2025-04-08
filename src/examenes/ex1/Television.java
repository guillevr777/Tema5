package examenes.ex1;

public class Television extends Mando implements Volumen{

	private int volumen;
	private int canal;	
	
	public Television(String modelo, double anchura, double altura, double precio) {
		super(modelo, anchura, altura, precio);
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	@Override
	public boolean subirVolumen() {
		boolean exito = false;
			if (volumen <= 95) {
				this.volumen += 5;
			}
		return exito;
	}

	@Override
	public boolean bajarVolumen() {
		boolean exito = false;
		if (volumen >= 5) {
			this.volumen -= 5;
		}
	return exito;
	}

	@Override
	public void mostrarVolumen() {
		System.out.println(this.volumen);
	}
}
