package br.com.talita.exercicios.poo;

public class Caneta {

	// Atributos
	public String modelo;
	public String cor;
	private double ponta;
	protected int carga;
	private boolean tampada;

	// Métodos
	// Lembrando que void significa sem retorno
	public void status(){
		//this é o nome do objeto que chamou o método
		System.out.println("Modelo " + this.modelo);
		System.out.println("Cor " + this.cor);
		System.out.println("Ponta " + this.ponta);
		System.out.println("Carga " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
	}

	public void tampar() {
		this.tampada = true;
		//this é o nome do objeto que chamou o método
	}

	public void destampar() {
		this.tampada = false;
	}
	
	public void rabiscar() {
		if (this.tampada == true){
			System.out.println("Erro! Não posso rabiscar");
		} else {
			System.out.println("Estou rabiscando");
		}
	}
}
