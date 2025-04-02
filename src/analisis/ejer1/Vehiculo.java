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
	
	public boolean parar() {
		boolean parar = false;
		
		if (this.marcha == 0 && this.velocidad == 0) {
			this.encendido = false;
			parar = true;
		}
		
		return parar;
	}
	
	public boolean arrancar() {
		boolean arrancar = false;
		
		if (this.marcha <= 2 && this.velocidad == 0 && this.encendido != true) {
			this.encendido = true;
			arrancar = true;
		}
		
		return arrancar;
	}
	
	public void subirMarcha() {
		this.marcha++;
	}
	
	public void bajarMarcha() {
		this.marcha--;
	}
	
	public boolean acelerar(int velocidad) {
		boolean acelerar = false;
		
		if(this.velocidad < velocidad && this.encendido) {
			acelerar = true;
			
			while(this.velocidad < velocidad) {
				
				this.velocidad += 10;
				System.out.println(this.velocidad);
				
				if(this.velocidad >=0 && this.velocidad<30 && marcha<1) {
					subirMarcha();
					System.out.println("Cambio de marcha: " + this.marcha);
				} else if(this.velocidad >=30 && this.velocidad<50 && marcha<2) {
					subirMarcha();
					System.out.println("Cambio de marcha: " + this.marcha);
				} else if(this.velocidad >=50 && this.velocidad<70 && marcha<3) {
					subirMarcha();
					System.out.println("Cambio de marcha: " + this.marcha);
				}  else if(this.velocidad >=70 && this.velocidad<100 && marcha<4) {
					subirMarcha();
					System.out.println("Cambio de marcha: " + this.marcha);
				}  else if (this.velocidad >=100 && marcha<5) {
					subirMarcha();
					System.out.println("Cambio de marcha: " + this.marcha);
				}
			}
		}
		
		return acelerar;
	}
	
	public boolean desacelerar(int velocidad) {
		boolean desacelerar = false;
		
		if(this.velocidad > velocidad) {
			desacelerar = true;
			
			while(this.velocidad > velocidad) {
				
				this.velocidad -= 10;
				System.out.println(this.velocidad);
				
				if(this.velocidad >=0 && this.velocidad<30 && marcha<1) {
					bajarMarcha();
					System.out.println("Cambio de marcha: " + this.marcha);
				} else if(this.velocidad >=30 && this.velocidad<50 && marcha<2) {
					bajarMarcha();
					System.out.println("Cambio de marcha: " + this.marcha);
				} else if(this.velocidad >=50 && this.velocidad<70 && marcha<3) {
					bajarMarcha();
					System.out.println("Cambio de marcha: " + this.marcha);
				}  else if(this.velocidad >=70 && this.velocidad<100 && marcha<4) {
					bajarMarcha();
					System.out.println("Cambio de marcha: " + this.marcha);
				}  else if (this.velocidad >=100 && marcha<5) {
					bajarMarcha();
					System.out.println("Cambio de marcha: " + this.marcha);
				}
			}
		}
		
		return desacelerar;
	}
	
	public boolean frenar(int velocidad) {
		boolean frenar = false;
		
		return frenar;
	}
	
	@Override
	public String toString () {
		return this.marca + " " + this.modelo + " " + this.matricula + "\nEncendido : " + this.encendido + " " + this.marcha + " " + this.velocidad;
	}
}
