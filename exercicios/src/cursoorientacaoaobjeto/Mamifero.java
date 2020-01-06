package cursoorientacaoaobjeto;

public class Mamifero extends Animal {

	private String corPelo; 
	
	@Override
	public void locomover(){
		System.out.println("Correndo");
	}

	@Override
	public void alimentar(){
		System.out.println("Mamando");
	}
	
	@Override
	public void emitirSom(){
		System.out.println("Som de mamífero");
	}
	
	@Override
	public void finalizar(){
		System.out.println("----------------------");
	}
	
	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
}
