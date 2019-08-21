package orientacaoaobjetop5;

//Aula sobre construtores e membros estáticos

public class TestaValores {

	public static void main(String[] args) {

		Conta conta = new Conta(1337, 24226);
		
		conta.setAgencia(-50);
		conta.setNumero(-330);
		
		Conta conta2 = new Conta(1337, 16549);
		
		System.out.println(Conta.getTotal());
	}

}
