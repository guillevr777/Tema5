package parteuno.ejertres;

public class Principal {

	public static void main(String[] args) {

		Producto P1 = new Producto(3.33, "Avellanas");
		NoPerecedero NP1 = new NoPerecedero(9.4, "Nutela", "Comida");
		Perecedero PE1 = new Perecedero(3.43, "Mesa", 2);
		System.out.println(P1);
		System.out.println(NP1);
		System.out.println(PE1);		
		System.out.println(P1.calcular(6));
		System.out.println(NP1.calcular(9));
		System.out.println(PE1.calcular(42));
	}
}
