package tasca7.N1ejercicio1;

public class Main {
	
	public static void main(String[] args) {
		
		Trabajador trabajador = new Trabajador("Pedro","Salvatierra" , 25);
		TrabajadorOnline trabajadorOnline =new TrabajadorOnline("Rodrigo","Cajas",16);
		TrabajadorPresencial trabajadorPresencial = new TrabajadorPresencial("Lida", "Huaman", 15);
	
		System.out.println(trabajador.getNombre() + " --> " + trabajador.calcularSueldo(150));
		System.out.println(trabajadorOnline.getNombre() + " --> " + trabajadorOnline.calcularSueldo(160));
		System.out.println(trabajadorPresencial.getNombre() + " --> " + trabajadorPresencial.calcularSueldo(156));
	
	}
}
