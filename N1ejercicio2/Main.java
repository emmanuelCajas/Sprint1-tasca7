package tasca7.N1ejercicio2;


public class Main {
	
	@SuppressWarnings("deprecation") 
	public static void main(String[] args) {
				
		TrabajadorOnline trabajadorOnline =new TrabajadorOnline("Rodrigo","Cajas",16);
				
		TrabajadorPresencial trabajadorPresencial = new TrabajadorPresencial("Lida", "Huaman", 25);
		
		trabajadorOnline.imprimirMensaje();
		trabajadorPresencial.horasExtras();
			
	}
}
