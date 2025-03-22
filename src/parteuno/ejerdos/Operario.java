package parteuno.ejerdos;

public class Operario extends Empleado{

	public Operario(String nombre) {
		super(nombre);
	}

	public String toString () {
		String persona = "";
		persona = super.toString();
		persona += " -> Operario";
		return persona;
	}
}
