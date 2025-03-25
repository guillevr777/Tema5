package interfaces.ejerdos;

import interfaces.ejeruno.Socio;

public class Futbolista implements Comparable<Futbolista>{

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
	
	public String toString () {
		return "";
	}
	
	public boolean equals (Object obj) {
		boolean iguales = false;
		Futbolista fut = (Futbolista) obj;
		if (this.númeroCamiseta == fut.númeroCamiseta && this.nombre.equals(fut.nombre)) {
			iguales = true;
		}
		return iguales;
	}
	
	@Override
	public int compareTo(Futbolista otro) {
		int resultado = 0;
		if (Integer.compare(this.númeroCamiseta, otro.númeroCamiseta) > 0 || Integer.compare(this.númeroCamiseta, otro.númeroCamiseta) < 0) {
			resultado = Integer.compare(this.númeroCamiseta, otro.númeroCamiseta);
		} else {
			resultado = this.nombre.compareTo(otro.nombre);
		}
        return resultado;
    }
}
