package leetcode;

public class GuessNumberHigherOrLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int guessNumber(int n) {
		int baixo = 1;
		int alto = n;
		while (baixo <= alto) {
			int meio = baixo + (alto - baixo) / 2;
			int response = guess(meio);
			if (response == 0)
				return meio;
			if (response == 1)
				baixo = meio + 1;
			if (response == -1)
				alto = meio - 1;
		}
		return 1;
	}
}
