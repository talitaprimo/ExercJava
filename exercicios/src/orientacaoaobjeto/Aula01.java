package orientacaoaobjeto;

public class Aula01 {

	public static void main(String[] args) {
		//Instanciar um objeto
		Caneta c1 = new Caneta();
		
		//Referência a atributo
		c1.cor = "Azul";
		
		//Chamada para o método
		c1.tampar();
		c1.status();
		c1.rabiscar();
		
		Caneta c2 = new Caneta();
		c2.cor = "Vermelha";
		c2.destampar();
		c2.status();
		c2.rabiscar();

	}

}
