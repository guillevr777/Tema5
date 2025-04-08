package repetircomparador.ejertres;

import java.util.Comparator;

public class Futbolista {

	private int númeroCamiseta;
	private String nombre;
	private int edad;
	private int númeroGoles;
	
	public Futbolista(int númeroCamiseta, String nombre, int edad, int númeroGoles) {
		this.númeroCamiseta = númeroCamiseta;
		this.nombre = nombre;
		this.edad = edad;
		this.númeroGoles = númeroGoles;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String toString () {
		return this.númeroCamiseta + " " + this.nombre + " " + this.edad + " " + this.númeroGoles;
	}
	
	public boolean equals (Object obj) {
		boolean iguales = false;
		Futbolista fut = (Futbolista) obj;
		if (this.númeroCamiseta == fut.númeroCamiseta && this.nombre.equals(fut.nombre)) {
			iguales = true;
		}
		return iguales;
	}
	
	// Comparador para ordenar por edad de mayor a menor
    public static Comparator<Futbolista> compararPorEdad = new Comparator<Futbolista>() {
        @Override
        public int compare(Futbolista s1, Futbolista s2) {
            return Integer.compare(s2.getEdad(), s1.getEdad());
        }
    };
    
 // Comparador para ordenar por nombre alfabéticamente
    public static Comparator<Futbolista> compararPorNombre = new Comparator<Futbolista>() {
        @Override
        public int compare(Futbolista s1, Futbolista s2) {
            return s1.getNombre().compareTo(s2.getNombre());
        }
    };
}
