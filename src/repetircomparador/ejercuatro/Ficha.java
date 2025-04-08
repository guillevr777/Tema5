package repetircomparador.ejercuatro;

public abstract class Ficha implements Comparable<Ficha> {
	
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
	
	@Override
	public int compareTo (Ficha a) {
		return Integer.compare(this.id, a.id);
	}
}
