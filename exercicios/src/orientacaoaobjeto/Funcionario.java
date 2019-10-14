package orientacaoaobjeto;

//Aula 10 - Herança

public class Funcionario extends PessoaComHeranca {
	private String setor;
	private boolean trabalhando;
	
	public void mudarTrabalho(){
		if(this.getTrabalhando() == true){
			this.setTrabalhando(false);
		} else {
			this.setTrabalhando(true);
		}
	}
	
	public String getSetor(){
		 return setor;
	}
	
	public boolean getTrabalhando(){
		return trabalhando;
	}
	
	public void setSetor(String setor){
		this.setor=setor;
	}
	
	public void setTrabalhando(boolean trabalhando){
		this.trabalhando=trabalhando;
	}
}
