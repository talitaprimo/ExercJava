package orientacaoaobjeto;

//Aula 09 - Exercício prático

public class Pessoa {

	private String nome;
	private int idade;
	private String sexo;
	
	public void fazerAniver(){
		this.idade = this.idade+1;  // ou this.idade++
	}
	
	public Pessoa(String n, int i, String s ){
		this.setNome(n);
		this.setIdade(i);
		this.setSexo(s);
	}

	public String getNome(){
		return nome;
	}
	
	public int getIdade(){
		return idade;
	}
	
	public String getSexo(){
		return sexo;
	}
	
	public void setNome(String n){
		this.nome=n;
	}
	
	public void setIdade(int i){
		this.idade = i;
	}
	
	public void setSexo(String s){
		this.sexo = s;
	}
}
