package parteuno.ejerdos;

public class Oficial extends Operario{

	public Oficial(String nombre) {
		super(nombre);
	}

	public String toString () {
		String persona = "";
		persona = super.toString();
		persona += " -> Oficial";
		return persona;
	}
}
