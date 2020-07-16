package br.com.talita.exercicios.composicao;

public class Pessoa {
	private String nome;
	private String cpf;
	private int idade;
	private Endereco endereco;
	//atributo endereco é uma referência a um endereço específico
	
	//Métodos getter e setter
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
