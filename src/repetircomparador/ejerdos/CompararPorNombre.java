package repetircomparador.ejerdos;

import java.util.Comparator;

public class CompararPorNombre implements Comparator<Socio> {

	@Override
	public int compare(Socio a, Socio b) {
		return a.getNombre().compareTo(b.getNombre());
	}
}
