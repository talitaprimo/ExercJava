package herancaepolimorfismo;

public class TesteReferencias {
	public static void main(String[] args) {
		
		//Exemplo de declaração de variável com tipo mais genérico, ou seja, do tipo Funcionario
		Funcionario g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		System.out.println("Salário do " + g1.getNome() + " = " + g1.getSalario());
		
		Funcionario nico = new Funcionario();
		nico.setNome("Nico Steppat");
		nico.setCpf("223355646-9");
		nico.setSalario(2600.00);
		System.out.println("Salário do " + nico.getNome() + " = " + nico.getSalario());
		
		EditorVideo ev = new EditorVideo();
		ev.setNome("Elias");
		ev.setSalario(2500);
		System.out.println("Salário do " + ev.getNome() + " = " + ev.getSalario());
		
		//Cada funcionário desejará ganhar a bonificação à qual faz jus, por isso, sempre será utilizado o método específico
		//Se estamos lidando com um gerente, o getBonificacao() será aquele específico da classe Gerente.
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(nico);
		controle.registra(ev);
		System.out.println("Soma das bonificações: " + controle.getSoma());
		
	}
}