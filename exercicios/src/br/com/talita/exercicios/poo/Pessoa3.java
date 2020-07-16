package br.com.talita.exercicios.poo;

//Aula 11 - Herança Parte 2

public abstract class Pessoa3 {
	protected String nome;
	protected int idade;
	protected String sexo;
	
	public void fazerAniver(){
		this.setIdade(this.getIdade()+1);
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
