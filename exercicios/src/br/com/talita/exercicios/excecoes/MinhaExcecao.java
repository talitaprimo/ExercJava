package br.com.talita.exercicios.excecoes;

//Aula 04 - Criar uma exceção (Unchecked)

public class MinhaExcecao extends RuntimeException {
	public MinhaExcecao(String msg){
		super(msg);
	}
}
