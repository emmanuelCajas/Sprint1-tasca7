package tasca7.N1ejercicio2;

public class TrabajadorOnline extends Trabajador  {

	public  static final double TARIFA_INTERNET = 80;

	public TrabajadorOnline(String nombre, String apellido, double precioHora) {
		super(nombre, apellido, precioHora);
	}

	
	@Override
	public double calcularSueldo(double horasTrabajdas) {
		return super.calcularSueldo(horasTrabajdas)+TARIFA_INTERNET;
	}
	
	@Deprecated
	public void imprimirMensaje() {
		System.out.println("Mensaje de metodo @Deprecade imprimirMensaje()");
	}
	 
	
}
