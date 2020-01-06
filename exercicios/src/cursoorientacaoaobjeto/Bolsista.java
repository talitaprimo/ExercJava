package cursoorientacaoaobjeto;

public class Bolsista extends Aluno2 {
	private float bolsa;
	
	public void renovarBolsa(){
		System.out.println("Renovando bolsa de " + this.nome);
	}
	
	//Método sobreposto
	@Override
	public void pagarMensalidade(){
		System.out.println(this.nome + " é bolsista. Pagamento facilitado!");
	}

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
}
