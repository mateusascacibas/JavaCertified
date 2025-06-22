package recursvidade;

public class recursivePalindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(recursivePalindromo("araras", 0));
	}
	
	public static boolean recursivePalindromo(String word, int index) {
		if(index == word.length() / 2) return true;
		int position = word.length() - (index + 1);
		boolean atual = String.valueOf(word.charAt(index)).equals(String.valueOf(word.charAt(position)));
		return atual && recursivePalindromo(word, index + 1);
	}

}
