package parteuno.ejercinco;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Principal {
	
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		
		Set<Poligono> poligonos = new HashSet<Poligono>();
		Poligono pol = null;
		int opc;
		int lado1;
		int lado2;
		int lado3;
		
		do {
			System.out.println("Dime que opcion quieres elegir?");
			menu();
			opc = reader.nextInt();
			reader.nextLine();
			switch (opc) {
			case 1 -> {
				System.out.println("Dime los lados del Triangulo:");
				lado1 = reader.nextInt();
				reader.nextLine();
				lado2 = reader.nextInt();
				reader.nextLine();
				lado3 = reader.nextInt();
				reader.nextLine();
				pol = new Triangulo(lado1,lado2,lado3);
				poligonos.add(pol);
			}
			case 2 -> {
				System.out.println("Dime los lados del Rectangulo:");
				lado1 = reader.nextInt();
				reader.nextLine();
				lado2 = reader.nextInt();
				reader.nextLine();
				pol = new Rectangulo(lado1,lado2);
				poligonos.add(pol);
			}
			case 3 -> {
				for (Poligono em : poligonos) {
					System.out.println(em);
					System.out.println("-----------------------");
				}
			}
			case 4 -> {
				System.out.println("Saliste del sistema...");
			}
			}
		} while (opc != 4);
	}
	
	static public void menu () {
		System.out.println("1.Introducir Triangulo\n2.Introducir Rectangulo\n3.Mostrar Poligonos\n4.Salir");
	}
}
