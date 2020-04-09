package excecoes;

//Aula 03 - Lançamento de exceções

public class Fluxo5 {
	public static void main(String[] args) {
		System.out.println("Ini do main");
		metodo1();
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1"); 
		//Não é exibido pois saímos abruptamente do método
	}

	private static void metodo2() {
		System.out.println("Ini do metodo2");
		throw new ArithmeticException ("Ocorreu um erro no método 2!");  //Passamos para o construtor a mensagem "Ocorreu um erro no método 2!"
		//System.out.println("Fim do metodo2");
	}
}
		/*O Java reconhece que, quando jogamos uma exceção, saímos abruptamente do código. 
		  Se isso acontece, não será possível executar a linha que mostra "Fim do metodo2". 
		  Por isso, comentaremos essa linha do bloco.*/
