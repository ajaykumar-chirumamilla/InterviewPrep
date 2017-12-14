
public class LongestIncreasingSubSequence {
	public int lis(int nums[]) {
		int[] count_array = new int[nums.length];
		for(int i=0;i<count_array.length;i++)
			count_array[i]=1;
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<i;j++) {
				if(nums[i]>nums[j])
					count_array[i]=max(count_array[j]+1,count_array[i]);
			}
		}
		int max = 0;
		for(int i=0;i<count_array.length;i++)
		{
			if(count_array[i]>max)
				max = count_array[i];
		}
		return max;
	}
	private int max(int i, int j) {
		// TODO Auto-generated method stub
		
		return i>j?i:j;
	}
	public static void main(String args[]) {
		LongestIncreasingSubSequence l = new LongestIncreasingSubSequence();
		int[] nums = {3,4,-1,0,6,2,3};
		System.out.println(l.lis(nums));
	}
}
