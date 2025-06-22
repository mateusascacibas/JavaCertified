package recursvidade;

public class sumPairValuesOddPositions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumPairValuesOddPositions(1357, 1));
		
	}
	
	public static int sumPairValuesOddPositions(int n, int index) {
		if(n == 0) return 0;
		int ultimo = n % 10;
		return ((ultimo % 2 == 0 && index % 2 != 0) ? ultimo: 0) + sumPairValuesOddPositions(n/10, index+1);
	}

}
