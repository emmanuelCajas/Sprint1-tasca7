package tasca7.N1ejercicio2;


public class Main {
	
	public static void main(String[] args) {
		
	
		@SuppressWarnings("deprecation")
		TrabajadorOnline trabajadorOnline =new TrabajadorOnline("Rodrigo","Cajas",16);
		
		@SuppressWarnings("deprecation")
		TrabajadorPresencial trabajadorPresencial = new TrabajadorPresencial("Lida", "Huaman", 25);
		
		trabajadorOnline.imprimirMensaje();
		trabajadorPresencial.horasExtras();
		
		
	}
}
