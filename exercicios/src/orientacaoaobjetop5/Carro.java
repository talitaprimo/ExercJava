package orientacaoaobjetop5;

public class Carro {
	private int ano;
	private String modelo;
	private double preco;
	
	public Carro(int ano, String modelo, double preco){
		this.ano=ano;
		this.modelo=modelo;
		this.preco=preco;
	}
	
	//Novo construtor
	public Carro(String modelo, double preco){
		this.ano=2017;
		this.modelo=modelo;
		this.preco=preco;
	}
}
