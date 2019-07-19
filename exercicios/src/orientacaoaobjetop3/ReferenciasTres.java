package orientacaoaobjetop2;

public class ReferenciasTres {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("Saldo da Primeira Conta: " + primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println("Saldo da Primeira Conta, após soma: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		segundaConta.saldo = 50;
		
		System.out.println("Saldo final da Primeira Conta: " + primeiraConta.saldo);
		System.out.println("Saldo final da Segunda Conta: " + segundaConta.saldo);
		
		System.out.println("Referência da primeira conta: " + primeiraConta);
		System.out.println("Referência da segunda conta: " + segundaConta);
	}

}
