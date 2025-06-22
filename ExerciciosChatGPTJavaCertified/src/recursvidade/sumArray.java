package recursvidade;

import java.util.ArrayList;
import java.util.List;

public class sumArray {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(sumArray(list, 0));

	}
	
	public static int sumArray(List<Integer> list, int index) {
		if(index == list.size()) return 0;
		return list.get(index) + sumArray(list, index+1);
	}

}
