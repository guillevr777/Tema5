package repetircomparador.ejerdos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		List<Socio> socios = new ArrayList<Socio>();
		Socio otro1 = new Socio(3,"Roman",21);
		Socio otro2 = new Socio(2,"Elena",19);
		Socio otro3 = new Socio(5,"Ivan",19);
		Socio otro5 = new Socio(3,"Guillermo",21);
		Socio otro4 = new Socio(4,"Henry",23);

		socios.add(otro2);
		socios.add(otro1);
		socios.add(otro4);
		socios.add(otro3);
		socios.add(otro5);
		
		// Creamos el comparador de los nombres creando una clase anonima
		Comparator<Socio> nombres = new Comparator<Socio>() {

			@Override
			public int compare(Socio a, Socio b) {
				return a.getNombre().compareTo(b.getNombre());
			}
		};
		
		// Creamos el comparador de las edades creando una clase anonima
		Comparator<Socio> edades = new Comparator<Socio>() {
					
			@Override
			public int compare(Socio s1, Socio s2) {
				return s2.getEdad() - s1.getEdad();
			}
		};
				
		socios.sort(nombres);
		
		System.out.println("Ordenado por nombres");
		for (Socio a : socios) {
			System.out.println("--------------------");
			System.out.println(a);
		}
		
		socios.sort(edades);

		System.out.println("\nOrdenado por edades");
		for (Socio a : socios) {
			System.out.println("--------------------");
			System.out.println(a);
		}
		
		Comparator<Socio> nombres2 = (a,b) -> { return a.getNombre().compareTo(b.getNombre());};
		
		socios.sort(nombres2);

		System.out.println("\nOrdenado por nombres2");
		for (Socio a : socios) {
			System.out.println("--------------------");
			System.out.println(a);
		}
		
		Comparator<Socio> edad2 = (a,b) -> { return a.getEdad() - b.getEdad();};
		
		socios.sort(edad2);

		System.out.println("\nOrdenado por edades2");
		for (Socio a : socios) {
			System.out.println("--------------------");
			System.out.println(a);
		}
	}
}
