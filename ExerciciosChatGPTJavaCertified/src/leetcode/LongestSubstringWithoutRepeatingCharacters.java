package leetcode;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
	}

	public static int lengthOfLongestSubstring(String s) {
		HashMap<Character, Integer> hm = new HashMap<>();
		int maxLength = 0;
		int left = 0;

		for (int right = 0; right < s.length(); right++) {
			char atual = s.charAt(right);

			if (hm.containsKey(atual) && hm.get(atual) >= left) {
				left = hm.get(atual) + 1;
			}

			hm.put(atual, right);

			maxLength = Math.max(maxLength, right - left + 1);
		}

		return maxLength;
	}

}
