package repetircomparador.ejercinco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal {

	public static void main(String[]args) {
		
		Titular titular = new Titular("29519783l", "Guillermo", "Villanueva", 627189704);
		Transaccion transaccion = new Transaccion(07, 03, 2004, "Pagos", 23.43);
		
		CuentaAhorro cuenta1 = new CuentaAhorro(22, 1.200, titular, 3.3, 4.3);
		CuentaAhorro cuenta2 = new CuentaAhorro(23, 1.300, titular, 3.3, 4.3);
		CuentaAhorro cuenta3 = new CuentaAhorro(11, 1.100, titular, 5.3, 4.3);
		CuentaAhorro cuenta4 = new CuentaAhorro(3, 1.000, titular, 3.3, 4.3);
		CuentaAhorro cuenta5 = new CuentaAhorro(100, 2000, titular, 1.1, 4.3);
		
		CuentaCorriente cuent2 = new CuentaCorriente(22, 3000, titular, 3, 7);
		
		cuent2.nuevaTransaccion(transaccion);
		
		List<CuentaAhorro> lista = new ArrayList<CuentaAhorro>();
		
		lista.add(cuenta2);
		lista.add(cuenta1);
		lista.add(cuenta3);
		lista.add(cuenta4);
		lista.add(cuenta5);
		
		Comparator<CuentaAhorro> c = (a,b) -> { return Double.compare(a.getSaldo(), b.getSaldo());};
		
		lista.sort(c);
		System.out.println(lista);
		
		
		//System.out.println(cuenta);
		//System.out.println(cuent2);
		//System.out.println();
		//cuent2.transacciones();

		
		
	}
}
