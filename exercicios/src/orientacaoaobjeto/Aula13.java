package orientacaoaobjeto;

//Aula 13 - Polimorfismo Parte 2 (Sobrecarga)

public class Aula13 {

	public static void main(String[] args) {
		
	Mamifero m = new Mamifero();
	m.emitirSom();
	m.finalizar();
		
	Lobo l = new Lobo();
	l.emitirSom();
	l.finalizar();
		
    Cachorro2 c2 = new Cachorro2();
    
    c2.emitirSom();
    c2.finalizar();
  
		c2.reagir("Olá");
		c2.finalizar();
		c2.reagir("Vai apanhar");
		c2.finalizar();
		c2.reagir(11,45);
		c2.finalizar();
		c2.reagir(21,00);
		c2.finalizar();
		c2.reagir(true);
		c2.finalizar();
		c2.reagir(false);
		c2.finalizar();
		c2.reagir(2,12.5f); 
		c2.finalizar();
		c2.reagir(17,4.5f);
		c2.finalizar();

	}

}
