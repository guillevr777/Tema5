package comparador.ejer1;

import java.util.ArrayList;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		
		Random random = new Random();

		ArrayList lista = new ArrayList();
		
		int numero;
		
		for (int i = 0 ; i < 20 ; i++) {
			numero = random.nextInt(0,101);
			lista.add(numero);
		}
		
		lista.sort(null);
		System.out.println(lista);
	}

}
