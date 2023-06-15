package proyectobytebank.arg;

public class PruebaAcceso {
	
	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta();
		cuenta.setAgencia(-22);		
		cuenta.depositar(400);
		cuenta.retirar(300);
		//Para evitar estos acontecimientos, 
		//en el lenguaje Java existe el ENCAPSULAMIENTO --> Como el funcionamiento del motor
		//del auto. No intervienes directamente en su funcionamiento. Aquí aparecen los modificadores
		// de acceso.
		
		System.out.println(cuenta.getSaldo());
		System.out.println(cuenta.getAgencia());
		
	}

}
