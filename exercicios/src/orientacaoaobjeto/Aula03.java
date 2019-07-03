package orientacaoaobjeto;

public class Aula03 {
	public static void main(String[] args) {
		CanetaAula03 c1 = new CanetaAula03();
		
		c1.setModelo("BIC");
		c1.setPonta(0.5f); //Podemos acessar atributos privados pois o método set é público 
		c1.status();
	}
}
