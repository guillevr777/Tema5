package parteuno.ejerdos;

public class Directivo extends Empleado{

	public Directivo(String nombre) {
		super(nombre);
	}
	
	public String toString () {
		String persona = "";
		persona = super.toString();
		persona += " -> Directivo";
		return persona;
	}
}
