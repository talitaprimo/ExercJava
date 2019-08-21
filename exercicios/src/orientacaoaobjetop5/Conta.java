package orientacaoaobjetop5;

public class Conta {
	// Atributos
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular; 
	//atributo titular não é uma String, é uma referência a um cliente específico
	private static int total;
	
	//Construtor
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("O total de contas é: " + Conta.total); //total da classe Conta
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando uma conta " + this.numero); //número deste objeto específico Conta
	}
	 
	//Métodos
	void deposita(double valor){
		this.saldo = this.saldo+valor;
	}
	
	public boolean saca (double valor){
		if (this.saldo >= valor){
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino){
		if (this.saldo >= valor){
			this.saldo = this.saldo - valor;
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
