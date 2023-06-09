package primerosPasos;

public class EjemploCiclos {
	
	public static void main(String[] args) {
		
		int contador = 0;
		int total = 0;
		
		while(contador <= 100) {
			
			total= total + contador;			
			System.out.println(contador);
			contador += 1;
			if (contador == 50) {
				
				System.out.println("Llegaste a la mitad, que es el numero " + contador);
				break;
				
			}
			
			
		}
		System.out.println("La suma de todo es: "+total);
	}

}
