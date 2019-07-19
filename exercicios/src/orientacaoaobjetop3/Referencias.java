package orientacaoaobjetop2;

public class Referencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); 
		// A variável primeiraConta faz referência a um objeto.
											
		primeiraConta.saldo = 300;

		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);

		Conta segundaConta = primeiraConta; 
		// Atribuímos a variável segundaConta a referência e não o objeto.
		// Exemplo de referência: orientacaoobjeto.Conta@15db9742

		System.out.println("Referência da segunda conta: " + segundaConta);

		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);

		segundaConta.saldo += 100;
		System.out.println("Saldo da segunda conta, após soma: " + segundaConta.saldo);

		System.out.println("Saldo da primeira conta, após soma: " + segundaConta.saldo);

		// temos duas referências para o mesmo objeto por isso os valores exibidos são iguais.

		if (primeiraConta == segundaConta) {
			System.out.println("Contas iguais!");
		} else {
			System.out.println("Contas diferentes!");
		}
		
		System.out.println("Referência da primeira conta: " + primeiraConta);
	}
}
