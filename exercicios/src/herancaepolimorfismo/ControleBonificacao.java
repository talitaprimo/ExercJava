package herancaepolimorfismo;

public class ControleBonificacao {
	private double soma;
	
	//Método registra() recebe uma referência genérica do tipo Funcionario
	//que é capaz de englobar tanto a classe Gerente quanto EditorVideo (pois todos são funcionários e pertencem a mesma hierarquia)
	
	public void registra(Funcionario f){
		double boni = f.getBonificacao();
		System.out.println("Bonificação do " + f.getNome() + " = " + f.getBonificacao());
		this.soma = this.soma+boni;
	}
	
	public double getSoma(){
		return this.soma;
	}
}
