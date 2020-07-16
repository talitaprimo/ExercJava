package br.com.talita.exercicios.poo;

//Aula05 - Exemplo prático

public class Aula05 {

	public static void main(String[] args) {
	ContaBanco c1 = new ContaBanco();     //criação do objeto c1
	c1.setNumConta(1111);
	c1.setDono("Jubileu");
	c1.abrirConta("CC");
	c1.depositar(300);
	c1.sacar(350);
	c1.fecharConta();
	c1.pagarMensalidade();
	c1.estadoAtual();

	ContaBanco c2 = new ContaBanco();
	c2.setNumConta(2222);
	c2.setDono("Creuza");
	c2.abrirConta("CP");
	c2.depositar(500);
	c2.sacar(100);
	c2.pagarMensalidade();
	c2.estadoAtual();
	
	}

}
