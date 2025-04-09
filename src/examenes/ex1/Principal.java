package examenes.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
	
	public static void main(String[] args) {
		List<Mando> mandos = new ArrayList<Mando>();
		boolean salir = false;
		Mando m1 = null;
		Mando m2 = null;
		Mando m3 = null;
		Mando m4 = null;
		Mando m5 = null;
		
		do {
			try {
				m1 = new Mando("LG1", 10, 5, 10);
				m2 = new Mando("LG2", 10, 5, 5);
				m3 = new Mando("LG3", 10, 5, 3.5);
				m4 = new Mando("LG4", 10, 5, 23);
				m5 = new Mando("LG5", 10, 5, 20.1);
				salir = true;

			} catch (ModeloException e) {
				System.out.println(e);
			} catch (PrecioException e) {
				System.out.println(e);
			}
		} while (!salir);

		mandos.add(m1);
		mandos.add(m5);
		mandos.add(m3);
		mandos.add(m2);
		mandos.add(m4);
		
		System.out.println(mandos);
		
		Collections.sort(mandos);
		
		System.out.println(mandos);
		
		mandos.sort((a, b) -> {return (int)(b.getPrecio() - a.getPrecio());});
		
		System.out.println(mandos);
		mandos.sort((a, b) -> {return b.getModelo().compareTo(a.getModelo());});
		
		System.out.println(mandos);
	}
}
