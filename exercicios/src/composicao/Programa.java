package composicao;

//Aula de composição de objetos

public class Programa {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("Paulo");
        
        Endereco e = new Endereco();
        e.setLogradouro("Avenida XYZ");
        p.setEndereco(e);
        
        System.out.println(p.getEndereco());
        
        System.out.println(p.getEndereco().getLogradouro());

	}

}
