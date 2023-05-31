package prac;

import java.util.HashSet;
import java.util.Set;

public class Solution2 {
	public int solution(int[] nums) {
		
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}

		if(set.size() > nums.length/2) {
			return nums.length/2; 
		} else {
			
			return set.size();
		}
	}

	public static void main(String[] args) {
		Solution2 sss = new Solution2();
		int[] nums = { 3, 1, 1, 3, 3, 2, 2, 2 };
		System.out.println(nums.length);
		System.out.println(sss.solution(nums));
		
	}
}
