package analisis.ejer1;

public class Vehiculo {

	private String marca;
	private String modelo;
	private String color;
	private String matricula;
	private boolean encendido = false;
	private int marcha = 0;
	private int velocidad = 0;
	
	public Vehiculo (String marca, String modelo, String color, String matricula) {
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.matricula = matricula;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public int getMarcha() {
		return marcha;
	}

	public int getVelocidad() {
		return velocidad;
	}
	
	public void parar() {
		
	}
	
	public void arrancar() {
		
	}
	
	public void subirMarcha() {
		
	}
	
	public void bajarMarcha() {
		
	}
	
	public boolean acelerar(int velocidad) {
		boolean acelerar = false;
		
		return acelerar;
	}
	
	public boolean frenar(int velocidad) {
		boolean frenar = false;
		
		return frenar;
	}
}
