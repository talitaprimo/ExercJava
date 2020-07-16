package orientacaoaobjetop5;

public class TesteContas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(1234,5678);
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(5678,9012);
		cp.deposita(200);
		
		cc.transfere(10, cp);
		
		System.out.println("Saldo CC: " + cc.getSaldo());
		System.out.println("Saldo CP: " + cp.getSaldo());

	}

}
