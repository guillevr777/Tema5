package repetircomparador.ejercinco;

import java.util.Comparator;

public class OrdenarOrdenDesc implements Comparator<Cuenta> {

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		return Double.compare(o1.saldo, o2.saldo);
	}
}
