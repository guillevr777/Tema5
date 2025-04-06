package comparador.ejercinco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[]args) {
		
		Titular titular = new Titular("29519783l", "Guillermo", "Villanueva", 627189704);
		Transaccion transaccion = new Transaccion(07, 03, 2004, "Pagos", 23.43);

		CuentaAhorro cuenta = new CuentaAhorro(22, 1.200, titular, 3.3, 4.3);
		CuentaCorriente cuent2 = new CuentaCorriente(22, 1.200, titular, 3, 7);
		
		cuent2.nuevaTransaccion(transaccion);
		
		//System.out.println(cuenta);
		System.out.println(cuent2);
		//System.out.println();
		//cuent2.transacciones();

	}
}
