package proyectobytebank.arg;

public class TestReferencia2 {
	
	public static void main(String[] args) {
		
		Cliente Diego = new Cliente();
		Diego.nombre = "Diego";
		Diego.documento = "45444332";
		Diego.telefono = "9992222";
		
		Cuenta cuentaDeDiego = new Cuenta();
		cuentaDeDiego.agencia = 1;
		cuentaDeDiego.titular = Diego;
		
		System.out.println(cuentaDeDiego.titular.documento);
		System.out.println(cuentaDeDiego.titular);
	}

}
