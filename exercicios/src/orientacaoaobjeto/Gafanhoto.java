package orientacaoaobjeto;

//Classe Gafanhoto herda os atributos e métodos da superclasse Pessoa4

public class Gafanhoto extends Pessoa4 {
	private String login;
	private int totAssistido;
	
	public void viuMaisUm(){
		
	}

	public Gafanhoto(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo); //Pessoa4 é a superclasse, portanto o comando super traz os parâmetros da superclasse
		this.login = login;
		this.totAssistido = 0;
	}
	
	@Override
	public String toString() {
	return "Gafanhoto{" + super.toString() + "\n{login=" + login + ", totAssistido=" + totAssistido + "}";
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotAssistido() {
		return totAssistido;
	}

	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}
	
	

}
