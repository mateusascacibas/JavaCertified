package recursvidade;

public class removeOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeOddNumbers(428571));
	}
	
	public static String removeOddNumbers(int n) {
		if(n == 0) return "";
		int ultimo = n % 10;
		return ((ultimo % 2 == 0? String.valueOf(ultimo): "")).concat(removeOddNumbers(n/10));
	}

}
