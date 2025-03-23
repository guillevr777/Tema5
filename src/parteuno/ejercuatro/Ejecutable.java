package parteuno.ejercuatro;

import java.util.ArrayList;

public class Ejecutable {

	 public static void main(String[] args) {
	        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();

	        // Creando distintos electrodomésticos
	        electrodomesticos.add(new Electrodomestico(200, 10));
	        electrodomesticos.add(new Lavadora(150, 30));
	        electrodomesticos.add(new Lavadora(300, 50, "AZUL", 'A', 35));
	        electrodomesticos.add(new Television(500, 15));
	        electrodomesticos.add(new Television(600, 20, "NEGRO", 'B', 50, true));
	        electrodomesticos.add(new Electrodomestico(100, 5, "ROJO", 'C'));

	        double totalElectrodomesticos = 0;
	        double totalLavadoras = 0;
	        double totalTelevisiones = 0;

	        // Recorriendo la lista y calculando los precios finales
	        for (Electrodomestico e : electrodomesticos) {
	        	e.precioFinal();
	            double precioFinal = e.getPrecioBase();
	            System.out.println("Precio final del electrodoméstico: " + precioFinal + "€");

	            totalElectrodomesticos += precioFinal;
	            
	            if (e instanceof Lavadora) {
	                totalLavadoras += precioFinal;
	            } else if (e instanceof Television) {
	                totalTelevisiones += precioFinal;
	            }
	        }

	        // Mostrando los totales
	        System.out.println("\nPrecio total de electrodomésticos: " + totalElectrodomesticos + "€");
	        System.out.println("Precio total de lavadoras: " + totalLavadoras + "€");
	        System.out.println("Precio total de televisiones: " + totalTelevisiones + "€");
	    }
}
