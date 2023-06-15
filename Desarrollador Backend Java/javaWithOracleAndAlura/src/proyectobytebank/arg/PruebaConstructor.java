package proyectobytebank.arg;

public class PruebaConstructor {
	
	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta(555);
		Cuenta cuenta2 = new Cuenta(333);
		Cuenta cuenta3 = new Cuenta(444);
				
		System.out.println(Cuenta.getTotal()); 
		
		
		//luego de poner public static, me sigue marcando total en amarillo, ya que para acceder a total, 
		//no necesito acceder a la instancia. Significa que puedo llamar al total basandome en Cuenta... Cuenta.total. Lo llamamos directamente
		//porque es una variable estática.
		
	}

}
