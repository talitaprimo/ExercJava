package tiposevariaveis;

public class TestaCaracteres {
	public static void main(String[] args){
		char letra = 'a';
		System.out.println(letra);
		
		char valor = 66;
		System.out.println(valor);
		//Na tabela Unicode o 65 corresponde à letra a, portanto 66 refere-se a b
		
		valor = (char) (valor +1);
		System.out.println(valor);
		/*valor é do tipo char e 1 é do tipo int
		o resultado dessa operação seria dado em int mas um int não cabe dentro de um char e ocorreria erro de compilação
		portanto foi necessário o casting, moldando-se para o char */
		
		String palavra = "cursos de tecnologia";
		System.out.println(palavra);
		
		palavra = palavra + 2020;
		System.out.println(palavra);
		//Operador + concatena String com número
	}
}
