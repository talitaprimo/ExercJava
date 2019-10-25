package orientacaoaobjeto;

//Aula 10 - Herança

public class PessoaComHeranca {
	
	private String nome;
	private int idade;
	private String sexo;
	
	public void fazerAniver(){
		this.setIdade(getIdade()+1);
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
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
	
	public void setNome(String nome){
		this.nome=nome;
	}
	
	public void setIdade(int idade){
		this.idade=idade;
	}
	
	public void setSexo(String sexo){
		this.sexo=sexo;
	}
}
