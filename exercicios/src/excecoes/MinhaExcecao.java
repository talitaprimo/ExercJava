package excecoes;

//Aula 04 - Criar uma exceção

public class MinhaExcecao extends RuntimeException {
	public MinhaExcecao(String msg){
		super(msg);
	}
}
