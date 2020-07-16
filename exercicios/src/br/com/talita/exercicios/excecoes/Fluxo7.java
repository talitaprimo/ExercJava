package br.com.talita.exercicios.excecoes;

//Aula 04 - Exemplo de StackOverflowError

public class Fluxo7 {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		metodo1(); 
		System.out.println("Fim do main");
	}

	private static void metodo1() {   
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Ini do metodo2");
		metodo2();
		System.out.println("Fim do metodo2");
	}
	
	/*O método 2 chama ele mesmo. Isso também é chamado de recursão.
	 * Essa ação se repete até não ter mais espaço na pilha.
	 * Nessa execução,teremos o erro StackOverflowError.
	 */
}
