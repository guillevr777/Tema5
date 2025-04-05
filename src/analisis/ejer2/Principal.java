package analisis.ejer2;

public class Principal {
	
	public static void main (String[] args) {
		
		Libro libro = new Libro(3,"El arbol","Freddy Mercury","Agostiny");
		Dvd dvd = new Dvd(1, "Invencible", "niidea", 2019, "Serie");
		Revista revista = new Revista(2, "bahamas", 15, 1999);
		
		System.out.println(libro.prestamo());
		System.out.println(dvd.prestamo());
		System.out.println(revista.getId());

	}
}
