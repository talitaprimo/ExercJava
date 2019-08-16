package orientacaoaobjetop5;

public class Conta {
	// Atributos
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular; 
	//atributo titular não é uma String, é uma referência a um cliente específico
	 
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
		this.numero=novoNumero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
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
}
