package courseUd;

public class regularExpression3 {
	public static void main(String[] args) {
		String mixOfWords = "Hiiyaa#@$%049*";
		System.out.println(mixOfWords);
		System.out.println(mixOfWords.replaceAll("[^a-z A-Z 0-9]",""));
		
		String spacedLetters = "   hi hello  how   r     u?";
		System.out.println(spacedLetters.replaceAll("\\s+"," ").trim());  // trim to delete the spaces at the starting of the word
	
		String letters = spacedLetters.replaceAll("\\s+"," ").trim();
		String words[] = letters.split("\\s");
		System.out.println(words.length);
	
	}
}
