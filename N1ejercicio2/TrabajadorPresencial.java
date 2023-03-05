package tasca7.N1ejercicio2;

public class TrabajadorPresencial extends Trabajador{
	
	public static double gasolina = 200;
	
	public TrabajadorPresencial(String nombre, String apellido, double precioHora) {
		super(nombre, apellido, precioHora);
	}

	@Override
	public double calcularSueldo(double horasTrabajdas) {
		return super.calcularSueldo(horasTrabajdas) + gasolina;
	}
	
	@Deprecated
	public void horasExtras() {
		System.out.println("Mensaje de metodo @Deprecade horasExtras()");
	}
	 
	
}
