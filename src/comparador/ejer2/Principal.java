package comparador.ejer2;

import java.util.ArrayList;
import java.util.Collections;
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
				
		socios.sort(Socio.compararPorNombre);
		
		System.out.println("Ordenado por edades");
		for (Socio a : socios) {
			System.out.println("--------------------");
			System.out.println(a);
		}
		
		socios.sort(Socio.compararPorEdad);

		System.out.println("\nOrdenado por nombres");
		for (Socio a : socios) {
			System.out.println("--------------------");
			System.out.println(a);
		}
	}
}
