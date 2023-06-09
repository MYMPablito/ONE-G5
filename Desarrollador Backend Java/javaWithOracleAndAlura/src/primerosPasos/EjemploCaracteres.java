package primerosPasos;

public class EjemploCaracteres {
	
	public static void main(String[] args) {
		
		char caracter = 'a'; // Para definirlo, usamos comillas simples y dobles para los Strings.
		
		System.out.println(caracter);
		
		caracter = 65;
		
		System.out.println(caracter); //No va a imprimir el número como tal, sino buscará en la tabla ASCII dicha ubicación.
		
		caracter = 65 + 1;
		
		char segundoCaracter = (char) (caracter + 1);
		
		System.out.println(segundoCaracter);
		
		//IMPORTANTE: String no es ni una palabra reservada ni es una variable primitiva. Es un OBJETO.
		
		String palabra = " Alura cursos online ";
		
		System.out.println(palabra);
		
		// si queremos concatenar, lo hacemos con la el signo "+" creando como resultado un nuevo objeto, una cadena de strings.
		
		String nombre = "Pablo Fernandez";
		
		String fecha = " 7 de junio de 2023 ";
		
		System.out.println("Hola, mi nombre es " + nombre + ", estoy haciendo la especialidad Backend Java en\n " 
		+ palabra + ", siendo hoy: " + fecha);
	}

}
