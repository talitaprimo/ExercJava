package orientacaoaobjeto;

public class Caneta {

	// Atributos
	String modelo;
	String cor;
	double ponta;
	int carga;
	boolean tampada;

	// Métodos
	// Lembrando que void significa sem retorno
	void status(){
		//this é o nome do objeto que chamou o método
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Está tampada? " + this.tampada);
		System.out.println("Modelo " + this.modelo);
		System.out.println("Ponta " + this.ponta);
		System.out.println("Carga " + this.carga);
	}

	void tampar() {
		this.tampada = true;
		//this é o nome do objeto que chamou o método
	}

	void destampar() {
		this.tampada = false;
	}
	
	void rabiscar() {
		if (this.tampada == true){
			System.out.println("Erro! Não posso rabiscar");
		} else {
			System.out.println("Estou rabiscando");
		}
	}
}
