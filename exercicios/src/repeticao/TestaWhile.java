package repeticao;

public class TestaWhile {

	public static void main(String[] args) {
		int contador = 0;
		// necessário inicializar e declarar a variável a ser utilizada

		while (contador <= 10) {
			System.out.println(contador);
			contador = contador + 1;

			// Podemos usar também contador += 1;
			// Ou contador++;
		}
		
		System.out.println("Ao fim do laço, a variável contador vale " + contador);
	}

}
