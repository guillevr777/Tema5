package repetircomparador.ejercinco;

import java.util.Comparator;

public class OrdenarApellidoNombreTitular implements Comparator<Titular> {

	@Override
	public int compare(Titular o1, Titular o2) {
		
		if (o1.getApellido().equals(o2.getApellido())) {
			return o1.getNombre().compareTo(o2.getApellido());
		} else {
			return o1.getApellido().compareTo(o2.getApellido());
		}
	}
}
