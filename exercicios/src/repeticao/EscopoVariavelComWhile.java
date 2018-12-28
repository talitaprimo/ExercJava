package repeticao;

public class EscopoVariavelComWhile {

	public static void main(String[] args) {
		int contador = 0;
		while (contador <= 10) {
			int total = 0;
			/* Toda vez que se entra no while, é criada uma nova variável total
			* por causa do escopo e, ao voltarmos ao próximo laço, quando
			* ocorre a iteração, ele zera de novo, pois a velha total já deixou
			* de existir.
			*/
			total = total + contador;
			System.out.println(total);
			contador++;
		}
	}

}
