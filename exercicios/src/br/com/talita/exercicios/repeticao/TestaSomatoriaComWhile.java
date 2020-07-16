package br.com.talita.exercicios.repeticao;

public class TestaSomatoriaComWhile {

	public static void main(String[] args) {
		int contador = 0;
		int total = 0;
		while (contador <= 10) {
			total = total + contador; //total += contador
			System.out.println(total);
			contador++;
		}
	}
}
