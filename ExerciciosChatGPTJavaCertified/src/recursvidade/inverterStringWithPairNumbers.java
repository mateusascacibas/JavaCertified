package recursvidade;

public class inverterStringWithPairNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(inverterStringWithPairNumbers(48275));
	}
	
	public static String inverterStringWithPairNumbers(int n) {
		if(n == 0) return "";
		int ultimo = n % 10;
		return ((ultimo % 2 == 0)? String.valueOf(ultimo) : "") + inverterStringWithPairNumbers(n/10); 
	}

}
