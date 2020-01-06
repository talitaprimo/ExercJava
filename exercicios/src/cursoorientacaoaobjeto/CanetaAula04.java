package cursoorientacaoaobjeto;

public class CanetaAula04 {
	
	private String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;

	public CanetaAula04(String m, String c, float p) { //Método construtor com parâmetros
		this.modelo = m;
		this.cor = c;
		this.ponta = p;
		this.tampar();
	}
	
	public void status(){
			System.out.println("Sobre a caneta:");
			System.out.println("Modelo: " + this.modelo);
			System.out.println("Ponta: " + this.ponta);
			System.out.println("Cor: " + this.cor);
			System.out.println("Tampada: " + this.tampada);
	}
	
	public void tampar(){
		this.tampada =  true;
	}

}
