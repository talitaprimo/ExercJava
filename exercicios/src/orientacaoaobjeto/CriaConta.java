package orientacaoaobjeto;

public class CriaConta {

	public static void main(String[] args) {
		//instaciar um objeto
		Conta primeiraConta = new Conta(); 
		
		primeiraConta.saldo = 200; // inserir um valor para o atributo saldo

		System.out.println(primeiraConta.saldo);

		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);

		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;

		System.out.println("Saldo da Primeira Conta: " + primeiraConta.saldo);
		System.out.println("Saldo da Segunda Conta: " + segundaConta.saldo);

		System.out.println("Agência da Primeira Conta: " + primeiraConta.agencia); // valor default
																					
		System.out.println("Número da Primeira Conta: " + primeiraConta.numero); // valor default
																					
		if (primeiraConta == segundaConta) {
			System.out.println("Contas iguais!");
		} else {
			System.out.println("Contas diferentes!");
		}
		
		System.out.println("Referência da primeira conta: " + primeiraConta);
		System.out.println("Referência da segunda conta: " + segundaConta);

	}
}
