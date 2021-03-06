package br.com.talita.exercicios.poo;

public class Reptil extends Animal {
	private String corEscama;
	
	@Override
	public void locomover(){
		System.out.println("Rastejando");
	}
	
	@Override
	public void alimentar(){
		System.out.println("Comendo vegetais");
	}
	
	@Override
	public void emitirSom(){
		System.out.println("Som de réptil");
	}
	
	@Override
	public void finalizar(){
		System.out.println("----------------------");
	}
	
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
}
