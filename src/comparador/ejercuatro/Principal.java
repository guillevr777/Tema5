package comparador.ejercuatro;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {
	
	public static void main (String[] args) {
		
		Libro libro = new Libro(3,"El arbol","Freddy Mercury","Agostiny");
		Dvd dvd = new Dvd(1, "Invencible", "niidea", 2019, "Serie");
		Revista revista = new Revista(2, "bahamas", 15, 1999);
		
		System.out.println(libro.prestamo());
		System.out.println(dvd.prestamo());
		System.out.println(revista.getId());
		
		System.out.println();

		ArrayList <Ficha> fichas = new ArrayList<>();
	       
		fichas.add(revista);
		fichas.add(dvd);
		fichas.add(libro);

	        System.out.println("Orden por número");
	        Collections.sort(fichas);
	        for (Ficha f : fichas) {
	            System.out.println(f);
	        }

	        System.out.println("Orden alfabético");
	        Collections.sort(fichas, new ComparaTitulo());
	        for (Ficha f : fichas) {
	            System.out.println(f);
	        }	
	}
}
