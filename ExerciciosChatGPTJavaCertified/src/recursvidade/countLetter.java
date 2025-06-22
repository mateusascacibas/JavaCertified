package recursvidade;

public class countLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countLetterProblem("abacaxi","a", 0));
	}
	
	public static int countLetterProblem(String word,String target, int index) {
		if(index == word.length()) return 0;
		int count = String.valueOf(word.charAt(index)).equals(target)? 1: 0;
		return count + countLetterProblem(word, target, index + 1);
	}

}
