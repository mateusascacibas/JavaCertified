package leetcode;

public class FirstBadVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int firstBadVersion(int n) {
        int baixo = 0;
        int alto = n;
        while(baixo <= alto){
            int meio = baixo + (alto - baixo) / 2;
            boolean response = isBadVersion(meio);
            if(response) alto = meio - 1;
            if(!response) baixo = meio + 1;
        }
        return baixo;
	}
}
