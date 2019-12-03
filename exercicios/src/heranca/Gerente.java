package heranca;

public class Gerente extends Funcionario {
	private int senha; //se não inicializamos o atributo recebe o valor zero automaticamente
	
	public boolean autentica (int senha){
		if(this.senha == senha){
			return true;
		}
		return false;
	}

	@Override
	public double getBonificacao(){
		return (super.getBonificacao()+super.getBonificacao());
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
}
