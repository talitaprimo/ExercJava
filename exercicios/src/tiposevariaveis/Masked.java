package tiposevariaveis;

public class Masked {

	public static void main(String[] args) {
		
		String id = "FBCRZPE6RSR7DRGRVN";
		
		System.out.println("Antes de substituir " + id);
		
		id = id.replaceAll("FBCRZPE6RSR7DRGRVN", "**********");
		
		System.out.println("Depois de substituir " + id);

	}
}