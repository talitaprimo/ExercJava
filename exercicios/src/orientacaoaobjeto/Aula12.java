package orientacaoaobjeto;

//Aula 12 - Polimorfismo Parte 1 (Sobreposição)

public class Aula12 {

	public static void main(String[] args) {
		//Animal é uma classe abstrata portanto não podemos instanciar um objeto a partir dessa classe
		
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();

		m.setPeso(85.3f);
		m.setIdade(2);
		m.setMembros(4);
		m.setCorPelo("Marrom");
		m.locomover();  // Correndo
		m.alimentar();  // Mamando
		m.emitirSom();  // Som de Mamífero
		m.finalizar();
		
		p.setPeso(0.35f);
		p.setIdade(1);
		p.setMembros(0);
		p.locomover(); // Nadando
		p.alimentar(); // Comendo substâncias
		p.emitirSom(); // Peixe não faz som
		p.soltarBolha();
		p.finalizar();
		
		a.setPeso(0.89f);
		a.setIdade(2);
		a.setMembros(2);
		a.locomover(); // Voando
		a.alimentar(); // Comendo frutas
		a.emitirSom(); // Som de ave
		a.fazerNinho();
		a.finalizar();
		
		//Polimorfismo: os mesmos métodos geram resultados diferentes
		//Polimorfismo de sobreposição: os métodos devem ter a mesma assinatura
		//assinatura é a quantidade e tipo dos parâmetros
		
		Canguru c = new Canguru();
		Cachorro k = new Cachorro();
		
		c.setPeso(55.30f);
		c.setIdade(3);
		c.setMembros(4);
		c.locomover(); // Saltando
		c.alimentar();
		c.emitirSom();
		c.usarBolsa();
		c.finalizar();
		
		k.setPeso(3.94f);
		k.setIdade(5);
		k.setMembros(4);
		k.locomover(); // Correndo - Nesse caso, não houve sobreposição
		k.alimentar();
		k.emitirSom();
		k.abanarRabo();
		k.finalizar();
		
		Cobra j = new Cobra();
		Tartaruga t = new Tartaruga();
		Goldfish g = new Goldfish();
		Arara e = new Arara();
		
		
	}

}
