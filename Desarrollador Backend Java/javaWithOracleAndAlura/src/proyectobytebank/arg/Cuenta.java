package proyectobytebank.arg;

public class Cuenta {
	
		private double getSaldo;
		private int agencia;
		private int getNumero;
		private Cliente titular = new Cliente();
		
		private static int total = 0; 
		//static nos dice que esta variable no será
		// de la instancia (en este caso new Cuenta()), sino que será de la clase.
		//También static nos dice que esta variable no será alterada por la instancia.
		//Siendo más técnicos, static nos dice que en un lugar de la memoria,  será
		//creada esta variable total y todas las demás instancias que sean creadas
		// a partir de esta clase, apuntarán a la variable total.
		
		public Cuenta(int agencia, int numero) { //Constructor.
			
			if (agencia <= 0) {
				System.out.println("No se permite 0.");
				this.agencia = 1;
			} else {
				this.agencia = agencia;
			}
			total ++;
			
			System.out.println("Se van creando: " + total + " cuenta/s.");
		}
		
		
		
/* Vamos a definir nuestro primer método(). En la POO definimos como método
a toda secuencia de pasos para realizar una cosa u acción. Como todo método,
puede o no recibir PARÁMETROS: Información necesaria que ese método necesita usar. 
Sería el input que recibiría el método. Tenemos los métodos que retornan valor y los que no */
		
		//No retorna valor
		public void depositar(double valor) { //no retorna valor
			// Esta cuenta          esta cuenta
			//This account          this account
			//This object
			this.getSaldo = this.getSaldo += valor;			
			
		}

		//Retorna valor
		public boolean retirar(double valor) {			
			
			if(this.getSaldo >= valor) {
				this.getSaldo -= valor;
				return true;
			} 
				return false;
			}
			
		
		
		public boolean transferir(double valor, Cuenta cuenta) {
			
			if (this.getSaldo >= valor) {
				this.getSaldo = this.getSaldo - valor;
				cuenta.depositar(valor);
				return true;
				} else {
					return false;
				}
			
		}
		
		// obtener = get, método GETTER;por buenas prácticas!!!
		// Si get es para obtener, set (SETTER) es para asignar.
		
		public double getSaldo() {
			
			return this.getSaldo;
			
		}
		
		//Recuerda, void no retorna un valor.
		
		
		public int getAgencia() {
			return agencia;
		}
		
		public void setTitular(Cliente titular) {
			this.titular = titular;
		}
		
		private double getNumero() {
			
			return this.getNumero;

		}
		
		public Cliente getTitular() {
			return titular;
		}
		
		public static int getTotal() {
			return Cuenta.total;
		}
		
	}


