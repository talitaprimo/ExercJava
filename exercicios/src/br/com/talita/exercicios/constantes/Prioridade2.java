package br.com.talita.exercicios.constantes;

public enum Prioridade2 {
	//Podemos associar valores a uma Enum mas para isso é necessário criar um método construtor
	MIN(1),
	NORMAL(5),
	MAX(10);
	
	//Atributo	
	private int valor;
	
	//Método construtor
	private Prioridade2(int valor){
		this.valor=valor;
	}
	
	//Enum é uma classe especial e nela podemos ter atributos e métodos.
	public int getValor(){
		return this.valor;
	}
}
