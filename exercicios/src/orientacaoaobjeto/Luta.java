package orientacaoaobjeto;

public class Luta {
	
	private String desafiado;
	private String desafiante;
	private int rounds;
	private boolean aprovada;
	
	public void marcarLuta(){
		
	}
	
	public void lutar(){
		
	}
	
	public String getDesafiado(){
		return desafiado;
	}
	
	public String getDesafiante(){
		return desafiante;
	}
	
	public int getRounds(){
		return rounds;
	}
	
	public boolean getAprovada(){
		return aprovada;
	}
	
	public void setDesafiado(String ddo){
		this.desafiado = ddo;
	}
	
	public void setDesafiante(String dte){
		this.desafiante = dte;

	}
	
	public void rounds(int r){
		this.rounds=r;
	}
	
	public void aprovada(boolean apr){
		this.aprovada = apr;
	}
	
}
