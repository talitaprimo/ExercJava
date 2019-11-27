package constantes;

public class TesteEnum {

	public static void main(String[] args) {
		
		 /*Enum é uma classe especial, onde o construtor é privado 
		 * 	portanto não podemos instanciar uma enumumeração.
		 */
		
		Prioridade pMin = Prioridade.MIN;
		Prioridade pMax = Prioridade.MAX;
		//Tipo objeto(referência) = nomeClasse.OBJETOSDACLASSEENUM;
		
		System.out.println(pMin.name());
		System.out.println(pMax.name());
		
		System.out.println(pMin.ordinal());
		System.out.println(pMax.ordinal());
	}
}
