package cursoorientacaoaobjeto;

//Aula 11 - Herança Parte 2

public class Aluno2 extends Pessoa3 {
	
	private int matricula;
	private String curso;
	
	public void pagarMensalidade(){
		System.out.println("Pagando mensalidade do aluno " + this.nome);
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
