package excecoes;

//Aula 02 - Exemplo de uso do método getMessage

public class Fluxo3 {
	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (ArithmeticException ex) {
			String msg = ex.getMessage();  //Método getMessage() pega a informação apresentada no console
			System.out.println("ArithmeticException" + msg);
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Ini do metodo2");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			int a = i / 0;
		}
		System.out.println("Fim do metodo2");
	}
}

/*Note que "Fim do metodo1" e "Fim do metodo2" não aparecem, 
porque main() é o único que possui código capaz de tratar a exceção.
Então é exibido "Fim do main" e é finalizado.*/
