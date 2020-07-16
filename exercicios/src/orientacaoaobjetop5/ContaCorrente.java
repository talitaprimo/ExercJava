package orientacaoaobjetop5;

class ContaCorrente extends Conta implements Tributavel {
	
	//Métodos construtores não são herdados automaticamente, por isso usamos super()
		
	public ContaCorrente(int agencia, int numero){
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor+0.2;
		return super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.setSaldo(super.getSaldo()+valor);
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo()*0.01;
	}
}


