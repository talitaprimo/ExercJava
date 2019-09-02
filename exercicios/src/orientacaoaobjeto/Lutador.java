package orientacaoaobjeto;

//Aula 07 e 08 - Relacionamento entre classes (Agregação)

public class Lutador {

	//Atributos
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	//private int vitorias, derrotas, empates; -- outra forma possível de declarar

	//Métodos
	public void apresentar(){
		System.out.println("-------------------------------------------------------------");
		System.out.println("Chegou a hora! Vamos apresentar o lutador " + this.getNome());
		System.out.println("Diretamente da " + this.getNacionalidade());
		System.out.println("com " + this.getIdade() + " anos e " + this.getAltura() + " m");
		System.out.println("pesando " + this.getPeso() + " Kg");
		if(this.getVitorias() == 1) {
			System.out.println(this.getVitorias() + " vitória");
		} else {
		System.out.println(this.getVitorias() + " vitórias");}
		if(this.getDerrotas() == 1){
			System.out.println(this.getDerrotas() + " derrota");
		} else {
			System.out.println(this.getDerrotas() + " derrotas");}
		if(this.getEmpates() == 1){
			System.out.println(this.getEmpates() + " empate!");
		} else {
		System.out.println(this.getEmpates() + " empates!");}
	}
	
	public void status(){
		System.out.println(this.getNome() + " é um peso " + this.getCategoria());
		
		if(this.getVitorias() == 1) {
			System.out.println("Ganhou " + this.getVitorias() + " vez");
		} else {
			System.out.println("Ganhou " + this.getVitorias() + " vezes");}
		
		if(this.getDerrotas() == 1){
			System.out.println("Perdeu " + this.getDerrotas() + " vez");}
		else {
			System.out.println("Perdeu " + this.getDerrotas() + " vezes");
		}
		
		if(this.getEmpates() == 1){
		System.out.println("Empatou " + this.getEmpates() + " vez");}
		else {
			System.out.println("Empatou " + this.getEmpates() + " vezes");
		}
	}
	
	public void ganharLuta(){
		this.setVitorias(this.getVitorias()+1);
	}
	
	public void perderLuta(){
		this.setDerrotas(this.getDerrotas()+1);
	}
	
	public void empatarLuta(){
		this.setEmpates(this.getEmpates()+1);
	}
	
	//Métodos especiais
	
	public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em ){
		this.setNome(no);            
		this.setNacionalidade(na);
		this.setIdade(id);
		this.setAltura(al);
		this.setPeso(pe);
		this.setVitorias(vi);
		this.setDerrotas(de);
		this.setEmpates(em);
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String no){
		this.nome = no;
	}
	
	public String getNacionalidade(){
		return nacionalidade;
	}
	
	public void setNacionalidade(String na){
		this.nacionalidade = na;
	}
	
	public int getIdade(){
		return idade;
	}
	
	public void setIdade(int id){
		this.idade = id;
	}
	
	public float getAltura(){
		return altura;
	}
	
	public void setAltura(float al){
		this.altura = al;
	}
	
	public float getPeso(){
		return peso;
	}
	
	public void setPeso(float pe){
		this.peso = pe;
		this.setCategoria();
	}
	
	public String getCategoria(){
		return categoria;
	}
	
	private void setCategoria(){               //Método set privado
		if (this.peso < 52.2){
			this.categoria = "Inválido";    
		} else if (this.peso <= 70.3){
			this.categoria = "Leve";
		} else if (this.peso <= 83.9){
			this.categoria = "Médio";
		} else if (this.peso <= 120.2){
			this.categoria = "Pesado";
		}
		else {
			this.categoria = "Inválido";
		}
	}
	
	public int getVitorias(){
		return vitorias;
	}
	
	public void setVitorias(int vi){
		this.vitorias = vi;
	}
	
	public int getDerrotas(){
		return derrotas;
	}
	
	public void setDerrotas(int de){
		this.derrotas = de;
	}
	
	public int getEmpates(){
		return empates;
	}
	
	public void setEmpates(int em){
		this.empates = em;
	}
}
