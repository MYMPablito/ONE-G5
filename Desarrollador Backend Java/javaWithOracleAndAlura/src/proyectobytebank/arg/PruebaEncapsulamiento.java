package proyectobytebank.arg;

public class PruebaEncapsulamiento {
	
	public static void main(String[] args) {
	
		Cuenta cuenta = new Cuenta();
	Cliente cliente = new Cliente();
	
	cliente.setNombre("Diego");
	cliente.setDocumento("fd254afr");
	
	cuenta.setTitular(cliente);
	
	System.out.println(cliente.getNombre());
	System.out.println(cuenta.getTitular().getNombre());

}
}
