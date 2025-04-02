package analisis.ejer1;

public class Principal {

	public static void main(String[] args) {

		Vehiculo vehiculo1 = new Camion("Volvo", "Forester", "Rojo", "5483GNK", true, 3000);
		Vehiculo vehiculo2 = new Motocicleta("Volvo", "Forester", "Rojo", "5483GNK", 125);
		Vehiculo vehiculo3 = new Turismo("Volvo", "Forester", "Gitano", "5483GNK", 5, "PROFESIONAL");
		Vehiculo vehiculo4 = new Camion("chevrolet", "Mustang", "Verde", "5483GNK", false, 4600);
		
		System.out.println(vehiculo3);
		
		vehiculo3.acelerar(100);
		
		vehiculo3.desacelerar(30);

		vehiculo3.parar();
		
		vehiculo3.arrancar();
		
		vehiculo3.acelerar(100);
		
		vehiculo3.desacelerar(0);
		
		vehiculo3.parar();

		System.out.println(vehiculo3);

	}
}
