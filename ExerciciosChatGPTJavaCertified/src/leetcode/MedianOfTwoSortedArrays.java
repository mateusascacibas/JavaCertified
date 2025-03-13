package leetcode;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		int[] nums1 = {1,3};
		int[] nums2 = {2};
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] arrayCombinado = new int[nums1.length + nums2.length];
		System.arraycopy(nums1, 0, arrayCombinado, 0, nums1.length);
		System.arraycopy(nums2, 0, arrayCombinado, nums1.length, nums2.length);
		Arrays.sort(arrayCombinado);
		if(arrayCombinado.length % 2 == 0) {
			return (arrayCombinado[arrayCombinado.length / 2 - 1] + arrayCombinado[arrayCombinado.length / 2]) / 2.0;
		}
		return arrayCombinado[arrayCombinado.length/2];

    }

}
