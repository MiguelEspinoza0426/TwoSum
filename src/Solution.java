import java.util.HashMap;

public class Solution {
	public int[] twoSum(int[] nums, int target) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		int rest = 0;
		int result []= new int[2];
		for(int i=0;i<nums.length;i++) {
			rest= target-nums[i];
			
			System.out.println(rest);
			System.out.println(map);
			
			if(map.containsKey(rest)) {
				result[0]=map.get(rest);
				result[1]=i;
			}else {
				map.put(nums[i], i);
			}
				
			
		}
		
		return result;
	}
}
