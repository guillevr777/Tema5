package analisis.ejer4;

	public class Persona extends Agenda {

		private String cumpleaños;
		
		public Persona(String nombre, int telefono, String cumpleaños) {
			super(nombre, telefono);
			this.cumpleaños = cumpleaños;
		}
		
		@Override
		public String toString () {
			return super.toString() + "\nCumpleaños: " + this.cumpleaños;
		}
}
