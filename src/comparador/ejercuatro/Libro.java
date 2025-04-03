package comparador.ejercuatro;

public class Libro extends Ficha {
	
	private String autor;
	private String editorial;

	public Libro(int id, String titulo, String autor, String editorial) {
		super(id, titulo);
		this.autor = autor;
		this.editorial = editorial;
	}
}
