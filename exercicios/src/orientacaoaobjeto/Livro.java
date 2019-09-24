package orientacaoaobjeto;

//Aula 09 - Exercício prático

public class Livro implements Publicacao {
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor; //leitor vai ser uma instância da classe Pessoa 
	
	public String detalhes() {
		return super.toString() + "Livro {" + "título = " + titulo + 
			", \n autor = " + autor + 
			",\n totPaginas = " + totPaginas + 
			",\n pagAtual = " + pagAtual + 
			",\n" + " aberto = " + aberto + 
			", \n leitor = " + leitor.getNome() +
			",\n idade = " + leitor.getIdade() +
			",\n sexo = " + leitor.getSexo() + "}";
			}

	public Livro(String tit, String aut, int tpag, Pessoa leitor) {
		this.setTitulo(tit);
		this.setAutor(aut);
		this.setTotPaginas(tpag);
		this.setLeitor(leitor);
		this.setAberto(false);
		this.setPagAtual(0);
	}

	public String getTitulo(){
		return titulo;
	}
	
	public String getAutor(){
		return autor;
	}
	
	public int getTotPaginas(){
		return totPaginas;
	}
	
	public int getpagAtual(){
		return pagAtual;
	}
	
	public boolean getAberto(){
		return aberto;
	}
	
	public Pessoa leitor(){
		return leitor;
	}
	
	public void setTitulo(String tit){
		this.titulo=tit;
	}
	
	public void setAutor(String aut){
		this.autor=aut;
	}
	
	public void setTotPaginas(int tpag){
		this.totPaginas=tpag;
	}
	
	public void setPagAtual(int pagAt){
		this.pagAtual=pagAt;
	}
	
	public void setAberto(boolean ab){
		this.aberto=ab;
	}
	
	public void setLeitor(Pessoa leitor){
		this.leitor=leitor;
	}

	@Override
	public void abrir() {
		this.setAberto(true);
	}

	@Override
	public void fechar() {
		this.setAberto(false);
		
	}

	@Override
	public void folhear(int pag) {
		if (pag > this.totPaginas){
			this.setPagAtual(0);
		} else {
		this.setPagAtual(pag);}
	}

	@Override
	public void avancarPag() {
		this.pagAtual++;
		
	}

	@Override
	public void voltarPag() {
		this.pagAtual--;
	}
}
