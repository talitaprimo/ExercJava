package br.com.talita.exercicios.condicional;

public class TestaEscopoVariavel {

	public static void main(String[] args) {
		boolean foiPromovido = true;

		if (foiPromovido) {
			double salario = 4200.0;
		} else {
			double salario = 3800.0;
		}

		/* Uma variável, a partir de sua declaração, passa a valer entre as
		   chaves correspondentes,
		   o que se denomina escopo. */

		// System.out.println(salario);
		
		// O código não compila, pois fora do bloco if/else a variável salario não existe mais.

	}
}