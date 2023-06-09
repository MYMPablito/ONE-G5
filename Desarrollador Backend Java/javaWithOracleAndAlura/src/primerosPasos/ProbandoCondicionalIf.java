package primerosPasos;

public class ProbandoCondicionalIf {
	
	public static void main(String[] args) {
		
		int edad = 21;
		int cantidadPersonas = 2;		
		boolean esPareja = cantidadPersonas > 1;
		
		if(edad >= 18 && cantidadPersonas >=2 && esPareja) {
			System.out.println("¡Bienvenido! Tienes más de 18 ó vienes acompañado.");
		}
		
		else {
	
				System.out.println("Lamentablemente, no puedes pasar.");
			}
		
		// Condicional: or(OR) --> ||, &&(AND) --> y. 
		
	}

}
