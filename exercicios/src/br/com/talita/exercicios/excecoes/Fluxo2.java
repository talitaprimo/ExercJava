package br.com.talita.exercicios.excecoes;

//Aula 02 - Exemplo de uso do comando try catch

public class Fluxo2 {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		metodo1();  
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		try {
			metodo2();
		} catch (ArithmeticException e){
			System.out.println("ArithmeticException");
		}  
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Ini do metodo2");
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
			int a = i/0; // Ocorreu um erro na primeira iteração do laço
		}
		System.out.println("Fim do metodo2"); // Não apareceu "Fim do metodo2", porque ele foi descartado. Voltamos ao método 1 seguindo à execução normal.
	}
}
