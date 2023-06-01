
public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {3,3};
		int target=6;
		Solution s = new Solution();
		int [] solution = new int[2];
		solution= s.twoSum(nums, target);
		System.out.println(solution[0]);
		System.out.println(solution[1]);
	}

}
