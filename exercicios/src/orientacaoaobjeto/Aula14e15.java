package orientacaoaobjeto;

//Aulas 14 e 15 - Exercício

public class Aula14e15 {

	public static void main(String[] args) {
		//Criar um vetor de vídeos
		Video v[] = new Video[3];
		
		//Chamar método construtor
		
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Aula 12 de PHP");
		v[2] = new Video("Aula 10 de HTML5");
		
		System.out.println(v[0].toString());
		
		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
		g[1] = new Gafanhoto("Creuza", 12, "F", "creuzita");
		
		System.out.println(g[0].toString());
	}
	
}