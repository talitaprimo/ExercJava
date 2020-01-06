package cursoorientacaoaobjeto;

//Aula 10 - Herança

public class Aluno extends Pessoa2 {
	private int matr;
	private String curso;
	
	public void cancelarMatr(){
		System.out.println("Matrícula será cancelada");
	}
	
	public int getMatr(){
		return matr;
	}
	
	public String getCurso(){
		return curso;
	}
	
	public void setMatr(int matr){
		this.matr=matr;
	}
	
	public void setCurso(String curso){
		this.curso=curso;
	}
}
