package herancaepolimorfismo;

public class Gerente extends Funcionario {
	
	//Reaproveite o método getBonificacao() da superclasse e some um salário à bonificação atual
	@Override
	public double getBonificacao(){
		return (super.getBonificacao()+super.getSalario());
	}
	
}
