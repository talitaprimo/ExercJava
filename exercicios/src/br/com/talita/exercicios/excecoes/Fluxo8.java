package br.com.talita.exercicios.excecoes;

//Aula 04 Criar uma exceção checked 

public class Fluxo8 {
	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException | MinhaExcecaoChecked ex) {
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() throws MinhaExcecaoChecked {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1"); 
	}

	private static void metodo2() throws MinhaExcecaoChecked {
		System.out.println("Ini do metodo2");
		throw new MinhaExcecaoChecked("Erro!");
	}
}