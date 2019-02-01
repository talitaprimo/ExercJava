package orientacaoaobjeto;

public class ReferenciasDois {

	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		minhaConta.saldo = 500.0;
		Conta outraConta = minhaConta;
		outraConta.saldo += 1000.0;
		System.out.println(minhaConta.saldo);

		// Imprime 1500, pois as duas referências (minhaConta e outraConta)
		// apontam para o mesmo objeto, fazendo com que a quantidade 1000 seja
		// somada à anterior 500.

	}

}
