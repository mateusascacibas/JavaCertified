package recursvidade;

public class sumPairPositions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumPairPositions(48275, 1));
	}
	
	public static int sumPairPositions(int n, int index) {
		if(n == 0) return 0;
		int ultimo = n % 10;
		return (index % 2 == 0 ? ultimo: 0) + sumPairPositions(n/10, index+1);
	}

}
