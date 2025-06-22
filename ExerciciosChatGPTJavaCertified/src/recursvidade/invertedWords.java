package recursvidade;

public class invertedWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(inverterWords("hoje é terça", 11));
	}
	
	public static String inverterWords(String word, int index) {
		if(index < 0) return "";
		String response = String.valueOf(word.charAt(index));
		return response + inverterWords(word, index-1);
		
	}

}
