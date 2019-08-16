package orientacaoaobjetop5;

//Aula de encapsulamento e visibilidade

public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.setNumero(1337);
		
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		
		paulo.setNome("Paulo Silveira");
		
		conta.setTitular(paulo); //Setter de referência
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		
	}

}
