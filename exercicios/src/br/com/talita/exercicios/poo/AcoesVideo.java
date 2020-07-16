package br.com.talita.exercicios.poo;

//Interface com 3 métodos abstratos

public interface AcoesVideo {
	public abstract void play();
	void pause();
	void like();
	
	//O padrão da interface é ter métodos públicos e abstratos portanto podemos omitir public abstract
}
