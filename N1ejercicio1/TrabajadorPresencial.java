package tasca7.N1ejercicio1;

public class TrabajadorPresencial extends Trabajador{
	
	public static double gasolina = 200;
	
	public TrabajadorPresencial(String nombre, String apellido, double precioHora) {
		super(nombre, apellido, precioHora);
	}

	@Override
	public double calcularSueldo(double horasTrabajdas) {
		return super.calcularSueldo(horasTrabajdas) + gasolina;
	}
	
	
	
}
