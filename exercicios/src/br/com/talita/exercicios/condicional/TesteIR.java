package br.com.talita.exercicios.condicional;

public class TesteIR {

	public static void main(String[] args) {
		double salario = 3300.0;

		if (salario < 2600.0) {
			System.out.println("A sua alíquota é de 15%");
			System.out.println("Você pode deduzir até R$ 350,00");
		}
		
		if (salario < 3750.0) {
			System.out.println("A sua alíquota é de 22,5%");
			System.out.println("Você pode deduzir até R$ 636,00");
		}
	}
}