package tasca7.N1ejercicio1;

public class Trabajador {

	private String nombre;
	private String apellido;
	private double precioHora;
	
	public Trabajador(String nombre, String apellido, double precioHora) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.precioHora = precioHora;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getPrecioHora() {
		return precioHora;
	}

	public void setPrecioHora(double precioHora) {
		this.precioHora = precioHora;
	}

	
	
	public double calcularSueldo(double horasTrabajdas) {
		
			return  horasTrabajdas * this.precioHora;
			
	}
	
	
	@Override
	public String toString() {
		return "TrabajadorPresencial [nombre=" + nombre + ", apellido=" + apellido + ", precioHora=" + precioHora + "]";
	}

}

