package orientacaoaobjeto;

public class ExercicioMetodo {

	public static void main(String[] args) {
		Conta contaTeste = new Conta();
		
		contaTeste.saldo = 100;
		System.out.println("Saldo inicial: " + contaTeste.saldo);
		
		contaTeste.deposita(50);
		System.out.println("Saldo após depósito: " + contaTeste.saldo);
		
		boolean conseguiuRetirar = contaTeste.saca(20);
		System.out.println("Conseguiu retirar? " + conseguiuRetirar);
		System.out.println("Saldo após saque: " + contaTeste.saldo);
	}

}
