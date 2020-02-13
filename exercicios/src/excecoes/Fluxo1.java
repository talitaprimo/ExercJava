package excecoes;

//Aula 01 - Exemplo de pilha de execução

public class Fluxo1 {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		metodo1();  
		// Para chamar um método que não tem uma referência ou um objeto criado, ele precisa ser static
		System.out.println("Fim do main");
	}

	private static void metodo1() {   //Método static
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Ini do metodo2");
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		System.out.println("Fim do metodo2");
	}
}
