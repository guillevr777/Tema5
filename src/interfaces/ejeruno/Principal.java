package interfaces.ejeruno;

public class Principal {

	public static void main(String[] args) {

		Socio otro1 = new Socio(1,"Guillermo",21);
		Socio otro2 = new Socio(2,"Elena",19);

		comparador (otro1,otro2);
		comparador (otro2,otro1);
		comparador (otro1,otro1);

		System.out.println(otro1 + "\n" + otro2);
	}
	static void comparador (Socio otro1, Socio otro2) {
		if (otro1.compareTo(otro2) > 0) {
			System.out.println("El id es mayor");
		} else if (otro1.compareTo(otro2) < 0) {
			System.out.println("El id es menor");
		} else {
			System.out.println("El id es igiuak");
		}
	}
}
