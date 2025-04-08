package repetircomparador.ejeruno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		Integer[] numeros = new Integer[20];
		
		Random rand = new Random();
		
		//Crear un comparador clásico usando una clase anónima
        Comparator<Integer> comparador = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b - a;
            }
        };
		
		for(int i=0; i<numeros.length; i++) {
			numeros[i] = rand.nextInt(1, 101);
		}

		System.out.println(Arrays.toString(numeros));
		
		Arrays.sort(numeros);
		System.out.println(Arrays.toString(numeros));
		
		Arrays.sort(numeros, comparador);
		System.out.println(Arrays.toString(numeros));
		
	}

}
