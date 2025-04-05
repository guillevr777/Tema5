package analisis.ejer2;

public class Dvd extends Ficha {
	
	enum Tipo {
		PELICULA,DOCUMENTAL,SERIE
	}
	
	private String director;
	private int año;
	private Tipo tipo;

	public Dvd(int id, String titulo, String director, int año, String tipo) {
		super(id, titulo);
		this.director = director;
		this.año = año;
		compruebaTipo(tipo);
	}

	public void compruebaTipo (String tipo) {
		switch (tipo) {
		case "PELICULA","DOCUMENTAL","SERIE" -> { 
			this.tipo = Tipo.valueOf(tipo);
			}
		}
	}

	@Override
	public int prestamo() {
		// TODO Auto-generated method stub
		return 5;
	}
}
