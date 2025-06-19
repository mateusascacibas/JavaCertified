package leetcode;

public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,0,3,5,9,12};
		System.out.println(search(nums, 13));
	}
	
	public static int search(int[] nums, int target) {
        int baixo = 0;
        int alto = nums.length - 1;

        while(baixo <= alto){
        	//-1,0,3,5,9,12
        	//alto = 6
        	//baixo 4
        	//target = 9
        	//meio =  3
            int position = (alto + baixo) / 2;
            int meio = nums[position];
            
            if(meio == target) return position;
            if(meio > target) alto = position - 1;
            else baixo = position + 1;
        }
        return -1;
    }

}
