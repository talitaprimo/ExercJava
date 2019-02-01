package orientacaoaobjeto;

public class Aula02 {

	public static void main(String[] args) {
		// Instanciar um objeto
		Caneta c1 = new Caneta();
		c1.modelo = "BIC Cristal";
		c1.cor = "Azul";
		// c1.ponta = 0.5; Atributo privado não pode ser usado nessa classe
		c1.carga = 80;
		// permite o uso do atributo protegido pois ele está dentro de uma
		// classe, que utiliza a classe Caneta
		//c1.tampada = false;
		c1.status();
		c1.rabiscar();
		c1.destampar();

	}

}