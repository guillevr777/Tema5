package interfaces.ejerdos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import interfaces.ejerdos.Futbolista;

public class Principal {

	public static void main(String[] args) {
		List<Futbolista> futbolistas = new ArrayList<Futbolista>();
		Futbolista otro1 = new Futbolista(1,"Guillermo",21,4);
		Futbolista otro2 = new Futbolista(6,"Elena",19,5);
		Futbolista otro3 = new Futbolista(5,"Ivan",19,1);
		Futbolista otro5 = new Futbolista(29,"Roman",21,7);
		Futbolista otro4 = new Futbolista(4,"HEnry",23,3);
		Futbolista otro6 = new Futbolista(4,"Henry",22,3);

		futbolistas.add(otro2);
		futbolistas.add(otro1);
		futbolistas.add(otro4);
		futbolistas.add(otro3);
		futbolistas.add(otro5);
		futbolistas.add(otro6);
		
		comparador(otro1,otro2);
		
		Collections.sort(futbolistas);
		
		for (Futbolista a : futbolistas) {
			System.out.println("--------------------");
			System.out.println(a);
		}
	}
	static void comparador (Futbolista otro1, Futbolista otro2) {
		if (otro1.compareTo(otro2) > 0) {
			System.out.println("El id es mayor");
		} else if (otro1.compareTo(otro2) < 0) {
			System.out.println("El id es menor");
		} else {
			System.out.println("El id es igiuak");
		}
	}
}
