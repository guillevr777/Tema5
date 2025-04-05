package comparador.ejeruno;

import java.util.Comparator;

public class Numeros implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2-o1;
	}
}
