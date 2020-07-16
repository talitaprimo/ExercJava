package orientacaoaobjetop5;

public abstract class Conta {
	// Atributos
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular; 
	//atributo titular não é uma String, é uma referência a um cliente específico
	private static int total=0;
	
	//Construtor
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("Total de contas: " + Conta.getTotal()); //total da classe Conta		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando uma conta " + this.numero); //número deste objeto específico Conta
	}
	 
	//Métodos
	public abstract void deposita(double valor);
	
	public boolean saca (double valor){
		if (this.saldo >= valor){
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean transfere(double valor, Conta destino){
		if(this.saca(valor)){
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
	
	public int getNumero(){
		return this.numero;
	}
	
	public void setNumero(int novoNumero){
		if(novoNumero <= 0){
			System.out.println("Número inválido!");
			return;
		}
		this.numero=novoNumero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 0){
			System.out.println("Número inválido!");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public static int getTotal(){    //Exemplo de Get com atributo estático
		return Conta.total;
		//ou return total;
	}
}
