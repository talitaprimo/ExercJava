package orientacaoaobjetop2;

public class ExercicioMetodo {

	public static void main(String[] args) {
		Conta contaTalita = new Conta();
		
		contaTalita.saldo = 100;
		System.out.println("Conta Talita - Saldo inicial: " + contaTalita.saldo);
		
		contaTalita.deposita(50);
		System.out.println("Conta Talita - Saldo após depósito: " + contaTalita.saldo);
		
		boolean conseguiuRetirar = contaTalita.saca(20);
		System.out.println("Conseguiu retirar? " + conseguiuRetirar);
		System.out.println("Conta Talita - Saldo após saque: " + contaTalita.saldo);
		
		Conta contaMarcela = new Conta ();
		contaMarcela.deposita(1000);
		System.out.println("Conta Marcela - Saldo após depósito: " + contaMarcela.saldo);
		
		if(contaMarcela.transfere(300, contaTalita)){
			System.out.println("Transferência com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}
		
		System.out.println("Conta Marcela - Saldo " + contaMarcela.saldo);
		System.out.println("Conta Talita - Saldo " + contaTalita.saldo);
		
	}

}
