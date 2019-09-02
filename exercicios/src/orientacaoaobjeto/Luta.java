package orientacaoaobjeto;

import java.util.Random;

//Aula 07 e 08 - Relacionamento entre classes (Agregação)

public class Luta {
	
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	public void marcarLuta(Lutador L1, Lutador L2){
		if(L1.getCategoria() == L2.getCategoria() && (L1 != L2)){
			this.setAprovada(true);
			this.setDesafiante(L2);
			this.setDesafiado(L1);
		} else {
			this.setAprovada(false);
			this.setDesafiante(null);
			this.setDesafiado(null); 	
		}
		
	}
	
	public void lutar(){
		if(this.getAprovada() == true){
			this.getDesafiado().apresentar();
			this.getDesafiante().apresentar();
			int vencedor = (int)(Math.random()*2);
			switch (vencedor == 0){
			case 1: 
				System.out.println("Empatou!");
				this.getDesafiante().empatarLuta();
				this.getDesafiado().empatarLuta();
				break; 
			case 2:
				System.out.println(this.getDesafiado().getNome() + " ganhou a luta");
				this.getDesafiado().ganharLuta();
				this.getDesafiante().perderLuta();
				break;
				
			case 3:
				System.out.println(this.getDesafiante().getNome() + " ganhou a luta");
				this.getDesafiante().ganharLuta();
				this.getDesafiado().perderLuta(); 
				break;}
			}
		} else {
			System.out.println("Luta não pode acontecer");
		}
	}
	
	public Lutador getDesafiado(){
		return desafiado;
	}
	
	public Lutador getDesafiante(){
		return desafiante;
	}
	
	public int getRounds(){
		return rounds;
	}
	
	public boolean getAprovada(){
		return aprovada;
	}
	
	public void setDesafiado(Lutador dd){
		this.desafiado = dd;
	}
	
	public void setDesafiante(Lutador dte){
		this.desafiante = dte;

	}
	
	public void setRounds(int r){
		this.rounds=r;
	}
	
	public void setAprovada(boolean apr){
		this.aprovada = apr;
	}
	
}
