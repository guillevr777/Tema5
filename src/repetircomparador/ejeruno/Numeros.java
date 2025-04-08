package repetircomparador.ejeruno;

import java.util.Comparator;

public class Numeros implements Comparator<Integer> {

	@Override
	public int compare(Integer a, Integer b) {
		return a - b;
	}
}
