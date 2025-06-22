package recursvidade;

import java.util.ArrayList;
import java.util.List;

public class countArrayValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(5);
		list.add(2);
		list.add(5);
		System.out.println(count(5, list, 0));
	}
	
	public static int count(int value, List<Integer> list, int index) {
		if(index == list.size()) return 0;
		int countAtual = list.get(index) == value ? 1 : 0;
		return countAtual + count(value, list, index+1);
		
	}

}
