package orientacaoaobjeto;

public class Aula04 {
	public static void main(String[] args) {
		CanetaAula04 c1 = new CanetaAula04();
		
		c1.setModelo("BIC");
		c1.setPonta(0.5f); //Podemos acessar atributos privados pois o método set é público 
		c1.status();
	}
}
