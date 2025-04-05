package analisis.ejer2;

public abstract class Ficha {
	
	private int id;
	private String titulo;
	
	public Ficha (int id, String titulo) {
		this.id = id;
		this.titulo = titulo;
	}

	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public abstract int prestamo ();
	
	public String toString() {
		return "ID:" + this.id + " TITULO:" + this.titulo;
	}
}
