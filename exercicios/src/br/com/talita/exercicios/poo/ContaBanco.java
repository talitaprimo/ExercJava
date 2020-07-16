package br.com.talita.exercicios.poo;

public class ContaBanco {

	//Atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;

	//Métodos Específicos ou personalizados
	
	public void estadoAtual(){
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo da conta: " + this.getTipo());
		System.out.println("Status da conta: " + this.getStatus());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("----------------------------------------");
	}
	
	public void abrirConta(String t){
		this.setTipo(t);       
		this.setStatus(true); // ou this.status = true;
		System.out.println("Conta aberta com sucesso!");

		/*this.setTipo(t); usa o método modificador
		 * this.tipo = t; acessa diretamente o atributo
		 */

		if (t == "CC"){
			this.setSaldo(50); 
		}
		else if (t == "CP") {
			this.setSaldo(150);
		}
	}

	public void fecharConta(){
		if (this.getSaldo() > 0){
			System.out.println("Conta não poderá ser fechada pois possui saldo disponível");
		}
		else if (this.getSaldo() < 0){
			System.out.println("Conta não poderá ser fechada pois possui débito");
		}
		else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}	
	}

	public void depositar(float v){
		if (this.getStatus() == true) {
			this.setSaldo(this.getSaldo()+v);  // ou this.saldo = this.saldo + v;
			System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
		}
		else {
			System.out.println("Não é possível realizar o depósito pois a conta está fechada");
		}
	}

	public void sacar(float v){
		if (this.getStatus() == true) { // ou if(this.getStatus()){
			if (this.getSaldo()>= v) {
				this.setSaldo(this.getSaldo() - v); // ou this.saldo = this.saldo - v;
				System.out.println("Saque realizado com sucesso na conta de " + this.getDono());
			} else {
				System.out.println("Não é possível realizar o saque pois não há saldo suficiente");
			}
		} else {
			System.out.println("Não é possível realizar o saque pois a conta está fechada");
		}
	}


	public void pagarMensalidade(){
		int valorMensalidade = 0; 
		if (this.getStatus() == true){
			if (this.getTipo() == "CC"){
				valorMensalidade = 12;
			}
			else if (this.getTipo() == "CP") {
				valorMensalidade = 20;
			}	
			if (this.getSaldo() >= valorMensalidade){
				this.setSaldo(this.getSaldo()-valorMensalidade);
			} else {
				System.out.println("Saldo insuficiente para pagamento da mensalidade");
			}
		}
		else {
			System.out.println("Conta fechada não é elegível a pagamento de mensalidade");
		}
	}

	//Métodos Especiais
	public ContaBanco(){         //Método Construtor
		this.status = false;
		this.saldo = 0;
	}

	public void setNumConta(int n){
		this.numConta = n;
	}

	public int getNumConta(){
		return this.numConta;
	}

	public void setTipo(String t){
		this.tipo = t;
	}

	public String getTipo(){
		return this.tipo;
	}

	public void setDono(String d){
		this.dono = d;
	}

	public String getDono(){
		return this.dono;
	}

	public void setSaldo(float s){
		this.saldo =  s;
	}

	public float getSaldo(){
		return this.saldo;
	}

	public void setStatus(boolean s){
		this.status = s;
	}

	public boolean getStatus(){
		return this.status;
	}
}
