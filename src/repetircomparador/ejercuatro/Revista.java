package repetircomparador.ejercuatro;

public class Revista extends Ficha {

	private int numeroRevistas;
	private int añoPublicacion;
	
	public Revista(int id, String titulo, int numeroRevistas, int añoPublicacion) {
		super(id, titulo);
		this.añoPublicacion = añoPublicacion;
		this.numeroRevistas = numeroRevistas;
	}

	@Override
	public int prestamo() {
		return 10;
	}

}
