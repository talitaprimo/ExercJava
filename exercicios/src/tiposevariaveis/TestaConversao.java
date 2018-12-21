package tiposevariaveis;

public class TestaConversao {
	public static void main(String[] args){
		
		double salario = 1270.50;
		int valor = (int)salario; 
		/*usaremos type casting para forçar a conversão do double para int
		lembrando que essa conversão forçada resulta em perda de valores */
		System.out.println(valor);
		
		double valor1=0.2;
		double valor2 = 0.1;
		double total = valor1+valor2;
		System.out.println(total);
		/*Imaginamos que nossa saída seria 0.3, mas obtemos um número completamente diferente.
		Devido essa inconsistência, double não é a melhor escolha para guardarmos salário. Existem outras alternativas melhores, como por exemplo, BigDecimal que veremos mais adiante*/
		
		float pontoFlutuante = 3.14f;
		System.out.println(pontoFlutuante);
	}
}
