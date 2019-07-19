package orientacaoaobjetop2;

public class ContaXCliente {

	public static void main(String[] args) {
		//cria cliente Talita
		Cliente talita = new Cliente();
		talita.nome = "Talita Primo";
		talita.cpf = "888.888.888-88";
	    talita.profissao = "Desenvolvedora";
	    
	    //cria conta Talita
	    Conta contaTalita = new Conta();
	    contaTalita.deposita(100);
	    
	    
	    //associa o cliente Talita a contaTalita
	    contaTalita.titular = talita;
	    
	    System.out.println("Titular: " + contaTalita.titular.nome);
	    System.out.println("Referência: " + contaTalita.titular);
	}

}
