package parteuno.ejeruno;

import java.util.Scanner;

public class Principal {
	
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		int opc;
		int hora;
		int minuto;
		int segundo;
		Hora españa = null;
		HoraExacta inglaterra = null;
		
		do {
			System.out.println("Elige una opcion:");
			menu(); 
			opc = reader.nextInt();
			reader.nextLine();
		switch (opc) {
		case 1 -> {
			System.out.println("Dime la hora a introducir:");
			hora = reader.nextInt();
			System.out.println("Dime los minutos");
			minuto = reader.nextInt();
			System.out.println("Dime los segundos");
			segundo = reader.nextInt();
			//Creamos un objeto de la clase hora
			españa = new Hora(hora, minuto);
			inglaterra = new HoraExacta(hora, minuto, segundo);
		}
		case 2 -> {
			System.out.println("Hora en españa:");
			System.out.println(españa.toString() + "\n" + inglaterra.toString());
		}
		case 3 -> {
			españa.inc();
			inglaterra.inc();
		}
		case 4 -> {
			System.out.println("Saliendo del programa...");
		}
		}
		} while (opc != 4);
	}
	public static void menu () {
		System.out.println("1.Meter Hora\n2.Listar\n3.Añadir segundo\n4.Salir");
	}
}
