package orientacaoaobjeto;

//Aula 02 - Classes e objetos

public class Aula02 {

	public static void main(String[] args) {
		// Instanciar um objeto
		Caneta c3 = new Caneta();
		
		c3.modelo = "BIC Cristal";
		c3.cor = "Azul";
		// c3.ponta = 0.5; Atributo privado não pode ser usado nessa classe
		c3.carga = 80;
		// permite o uso do atributo protegido pois ele está dentro de uma
		// classe, que utiliza a classe Caneta
		//c3.tampada = false;
		
		c3.status();
		c3.rabiscar();
		c3.destampar();

	}

}