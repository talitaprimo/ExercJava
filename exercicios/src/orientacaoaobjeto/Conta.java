package orientacaoaobjeto;

public class Conta {
	// Atributos
	double saldo;
	int agencia;
	int numero;
	String titular;

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
}
