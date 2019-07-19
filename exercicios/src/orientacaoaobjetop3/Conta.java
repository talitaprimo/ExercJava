package orientacaoaobjetop2;

public class Conta {
	// Atributos
	double saldo;
	int agencia;
	int numero;
	Cliente titular;

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
}
