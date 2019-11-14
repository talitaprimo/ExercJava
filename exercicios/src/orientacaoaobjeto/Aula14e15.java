package orientacaoaobjeto;

public class Aula14e15 {

	public static void main(String[] args) {
		//Criar um vetor de vídeos
		Video v[] = new Video[3];
		
		//Chamar método construtor
		
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Aula 12 de PHP");
		v[2] = new Video("Aula 10 de HTML5");
		
		System.out.println(v[0].toString());
		

	}

}
