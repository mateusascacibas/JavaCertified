package recursvidade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class countVowels {

	public static List<Character> vowels = new ArrayList<Character>(Arrays.asList('A', 'E', 'I', 'O', 'U'));
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countVowels("recursividade", 0));
	}
	
	public static int countVowels(String w, int index) {
		if(index == w.length()) return 0;
		int count =  vowels.contains(Character.toUpperCase(w.charAt(index))) ? 1 : 0;
		return count + countVowels(w, index + 1);
	}
}
