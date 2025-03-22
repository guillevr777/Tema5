package parteuno.ejerdos;

public class Tecnico extends Operario{

	public Tecnico(String nombre) {
		super(nombre);
	}

	public String toString () {
		String persona = "";
		persona = super.toString();
		persona += " -> Tecnico";
		return persona;
	}
}
