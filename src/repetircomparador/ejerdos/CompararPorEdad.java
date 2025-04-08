package repetircomparador.ejerdos;

import java.util.Comparator;

public class CompararPorEdad implements Comparator<Socio> {

	@Override
	public int compare(Socio o1, Socio o2) {
		return o2.getEdad() - o1.getEdad();
	}	
}
