package primerosPasos;

public class testConversion {
	
	public static void main(String[] args) {
		
		double salario = 1500.8;
		
		int valor = (int)salario; // usamos casting o casteo.
		
		System.out.println(valor);
		
		double valor1 = .2; // Cuando queremos escribir un número decimal en donde 
		//sea 0 el entero. Podemos omitirlo y poner luego del punto, el decimal.
		// Java si entiende esta notación y no produce errores.
		
		
		double valor2 = .1;
		
		double total = valor1 + valor2;
		
		System.out.println(total);
		
	}
	
	// Recuerda: para las variables primitivas, el casting no es más que hacer 
	// que esta conversión se realice cuando no se realiza automáticamente.
	
	
	/*
	 * 
TIPO	  TAMAÑO
boolean	   1 bit
byte	   1 byte
short	   2 bytes
char	   2 bytes
int	       4 bytes
float	   4 bytes
long	   8 bytes
double	   8 bytes
	 * 
	 * */

}
