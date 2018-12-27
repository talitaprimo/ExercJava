package tiposevariaveis;

public class TestaPontoFlutuante {
	public static void main(String[] args) {
		double salario = 1250.70;
		System.out.println("Meu salário é " + salario);

		double idade = 37;
		System.out.println(idade);

		double divisao = 3.14 / 2;
		System.out.println(divisao);

		int outraDivisao = 5 / 2;
		System.out.println(outraDivisao);
		// divisão entre dois números inteiros, Java "forçará" um número inteiro
		// como resultado

		double novaTentativa = 5 / 2;
		System.out.println(novaTentativa);
		// Java irá ler primeiro o lado que vem antes da atribuição, ou seja,
		// primeiro ele irá executar a divisão e depois ele tentará colocar o
		// resultado em um double

		double novaTentativa2 = 5.0 / 2;
		System.out.println(novaTentativa2);
		// double dividido por um int resulta em double

		/*
		 * Não podemos colocar um valor com ponto flutuante dentro de uma
		 * variável do tipo int.
		 * Int valor = 12.5; Não compila
		 * Int valor2 = 0.0; Não compila
		 * Int valor3 = teste; Não compila
		 */
	}
}
