package comparador.ejer2;

import java.util.Comparator;

public class Socio {

	private int id;
	private String nombre;
	private int edad;
	
	public Socio (int id, String nombre, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public int getEdad() {
		return this.edad;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	@Override
	public String toString () {
		return this.id + " " + this.nombre + " " + this.edad;
	}
	
	// Comparador para ordenar por nombre alfabéticamente
    public static Comparator<Socio> compararPorNombre = new Comparator<Socio>() {
        @Override
        public int compare(Socio s1, Socio s2) {
            return s1.getNombre().compareTo(s2.getNombre());
        }
    };

    // Comparador para ordenar por edad de mayor a menor
    public static Comparator<Socio> compararPorEdad = new Comparator<Socio>() {
        @Override
        public int compare(Socio s1, Socio s2) {
            return Integer.compare(s2.getEdad(), s1.getEdad());
        }
    };
}	