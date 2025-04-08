package analisis.ejer4;

	public class Empresa extends Agenda {

		private String paginaWeb;
		
		public Empresa(String nombre, int telefono, String paginaWeb) {
			super(nombre, telefono);
			this.paginaWeb = paginaWeb;
		}
		
		@Override
		public String toString () {
			return super.toString() + "\nPaginaWeb: " + this.paginaWeb;
		}
}
