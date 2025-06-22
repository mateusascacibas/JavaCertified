package recursvidade;

public class sumPairValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumPairs(4827));

	}
	
	public static int sumPairs(int n) {
		int ultimo = n%10;
		if(n == 0) return 0;
		int countAtual = ultimo;
		if(ultimo % 2 != 0) {			
			countAtual -= ultimo;
		}
		
		return countAtual + sumPairs(n/10);
	}

}
