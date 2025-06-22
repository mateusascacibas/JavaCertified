package recursvidade;

public class multOddValues {
	public static void main(String[] args) {
		System.out.println(multOddValues(1729));
	}
	
	public static int multOddValues(int n) {
		if(n == 0) return 1;
		int ultimo = n % 10;
		int count = 1;
		if(ultimo % 2 != 0) {
			count = ultimo;
		}
		return count * multOddValues(n/10);
	}
}
