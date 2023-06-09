package primerosPasos;

public class tipoIntYDouble {
	
	public static void main(String[] args) {
		
		double variable1 = 230.89;
		
		int variable1Entero = (int)variable1; // Casting. Forzar (en este caso) que variable1 sea un entero.
		
		System.out.println(variable1Entero);
		
		// Más tipos de datos
		
		long prueba = 12348952135712L; // Números muy grandes.
		
		short numeroPequenito = 13555;
		
		byte numeroAunMasPequeno = 15;
		
		float numeroDecimalPequeno = 2.5F;
		
		// Recordar que todo código que hagamos debe ser fácil de leer por otra persona.
		
		System.out.println(prueba); 
		System.out.println(numeroPequenito);
		System.out.println(numeroAunMasPequeno);
		System.out.println(numeroDecimalPequeno);
	}

}
