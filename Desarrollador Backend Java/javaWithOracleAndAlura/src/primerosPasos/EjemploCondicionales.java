package primerosPasos;

public class EjemploCondicionales {
	
	public static void main(String[] args) {
		
		int edad = 17;
		int cantidad = 2;
		
		if (edad >= 18) System.out.println("Usted puede pasar, ¡Bienvenido!");
		
		else {
			if(cantidad >= 2) System.out.println("Es menor pero viene acompañado, puede pasar");
			System.out.println("Es menor, retírese por favor!");
		}
		
	}

}
