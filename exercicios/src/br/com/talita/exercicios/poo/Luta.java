package br.com.talita.exercicios.poo;

import java.util.Random;

//Aula 07 e 08 - Relacionamento entre classes (Agregação)

public class Luta {
	
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	public void marcarLuta(Lutador l1, Lutador l2){
		//Categoria é do tipo String por isso usamos o método equals
		if(l1.getCategoria().equals(l2.getCategoria()) && (l1 != l2)){ 
			this.setAprovada(true);
			this.setDesafiante(l2);
			this.setDesafiado(l1);
		} else {
			this.setAprovada(false);
			this.setDesafiante(null);
			this.setDesafiado(null); 	
		}
	}
	
	public void lutar(){
		if(this.getAprovada() == true){
			System.out.println("### DESAFIADO ###");
			this.getDesafiado().apresentar();
			System.out.println("-----------------");
			System.out.println("### DESAFIANTE ###");
			this.getDesafiante().apresentar();
			System.out.println("-----------------");
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3); // irá gerar 3 resultados 0,1 ou 2
			System.out.println("Resultado da luta");
			
			switch (vencedor){
			case 0: 
				System.out.println("Empatou!");
				this.getDesafiante().empatarLuta();
				this.getDesafiado().empatarLuta();
				break; 
			case 1:
				System.out.println(this.getDesafiado().getNome() + " ganhou a luta");
				this.getDesafiado().ganharLuta();
				this.getDesafiante().perderLuta();
				break;
				
			case 2:
				System.out.println(this.getDesafiante().getNome() + " ganhou a luta");
				this.getDesafiante().ganharLuta();
				this.getDesafiado().perderLuta(); 
				break;}
			System.out.println("--------------------------------");
			} else {
			System.out.println("A luta não pode acontecer");
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
