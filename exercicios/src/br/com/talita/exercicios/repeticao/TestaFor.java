package br.com.talita.exercicios.repeticao;

public class TestaFor {

	public static void main(String[] args) {

		for (int contador = 0; contador <= 10; contador++) {
			System.out.println(contador);
		}
		
		/*
		 * Dentro dos parênteses, temos três "espaços" intercalados por ponto e
		 * vírgula. O primeiro espaço é opcional e costuma ter a declaração e
		 * inicialização da variável, sendo executado apenas uma vez. O segundo
		 * espaço é executado todas as vezes e contém a condição booleana, para
		 * saber se ele deve ou não entrar no laço. O terceiro espaço geralmente
		 * é ocupado por aquilo a ser executado ao fim de cada iteração.
		 * 
		 * Diferentemente do while, apesar de int contador = 0 valer no escopo do for inteiro, em todas as iterações,
		 * ele não é zerado, sendo executado apenas uma vez.
		 * 
		 * O for oferece a possibilidade de haver uma variável que participa de todas as iterações,
		 * mas depois do for, ela deixa de valer.
		 */
	}
}
