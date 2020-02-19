package excecoes;

//Aula 02 - Exemplo de uso do método printStackTrace

public class Fluxo4 {
	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (ArithmeticException ex) {
			ex.printStackTrace();  //Método exibe StackTrace 
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
