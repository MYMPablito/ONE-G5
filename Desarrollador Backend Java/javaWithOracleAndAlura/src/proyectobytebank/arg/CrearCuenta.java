package proyectobytebank.arg;

public class CrearCuenta {
	
	public static void main(String[] args) {
		
		// Variable(referencia)         Valor ---cada objeto creado genera un id.
		// Variable(referencia)         --> 123FFD 
		Cuenta primeraCuenta = new Cuenta(405,4);
		
		primeraCuenta.depositar(400);
		
		System.out.println(primeraCuenta.getSaldo());
		
		Cuenta segundaCuenta = new Cuenta(505,6);
		
		segundaCuenta.depositar(400);
		
		System.out.println(segundaCuenta.getSaldo());
		
		System.out.println(primeraCuenta.getAgencia());
		
		//System.out.println(primeraCuenta.titular);
		
		System.out.println(primeraCuenta);
		
		System.out.println(segundaCuenta);
		
		if(primeraCuenta == segundaCuenta) {
			
			System.out.println("Son el mismo objeto");
			
		}else {
			
			System.out.println("Son diferentes");
			
		}
		
	}

}
