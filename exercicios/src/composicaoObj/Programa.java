package composicaoObj;

//Aula de composição de objetos

public class Programa {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
        p.nome = "Paulo";
        
        Endereco e = new Endereco();
        e.logradouro = "Avenida XYZ";
        
        p.endereco = e;
   
        System.out.println(p.endereco.logradouro);

	}

}
