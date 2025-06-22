package recursvidade;

public class removeDuplicatedCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeDuplicatedCharacters("banana", "", 0));
	}
	
	public static String removeDuplicatedCharacters(String w, String visto, int index) {
		if(index == w.length()) return "";
		String atual = String.valueOf(w.charAt(index));
		if(visto.indexOf(atual) != -1) return removeDuplicatedCharacters(w, visto, index+1);
		return atual + removeDuplicatedCharacters(w, visto + atual, index + 1);
	}

}
