import java.util.HashSet;

public class TwoSum {
	 public int[] twoSum(int[] nums, int target) {
	       int[] res = new int[2];
		HashSet<Integer> map = new HashSet<>();
		for(int i=0;i<nums.length;i++)
		{
			if(map.contains(target-nums[i]))
			{
				res[1] = nums[i];
				res[0] = target-nums[i];
				return res;
			} 
			map.add(nums[i]);
			
		}
		return res;
	    }
public static void main(String args[]){
	int[] nums = {3,2,4,1};
	int target = 5;
	TwoSum t= new TwoSum();
	int[]  res = t.twoSum(nums, target);
	for(int i=0;i<2;i++)
		System.out.println(res[i]);
}

}
