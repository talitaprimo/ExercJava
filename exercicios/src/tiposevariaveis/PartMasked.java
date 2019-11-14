package tiposevariaveis;

public class PartMasked {

	public static void main(String[] args) {
		
		String id = "FBCRZPE6RSR7DRGRVN";
		
		StringBuilder myString = new StringBuilder(id);
		
		System.out.printf("Antes %s\n", myString.toString());
		
		char[] charArray = new char[myString.length()];
		
		myString.getChars(0, myString.length(), charArray, 0);
		
		for (int i = 0; i < (charArray.length-3); i++) {
			myString.setCharAt(i,'*');
		}
	
		System.out.printf("\nDepois %s", myString.toString());
		
	}
}
