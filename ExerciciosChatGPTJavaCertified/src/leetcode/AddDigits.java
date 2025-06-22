package leetcode;

public class AddDigits {
	public int addDigits(int num) {
        if(num < 10) return num;
        else{
            int rest = num % 10;
            int first = num / 10;
            num = rest + first;
        }
        return addDigits(num);
    }
}
