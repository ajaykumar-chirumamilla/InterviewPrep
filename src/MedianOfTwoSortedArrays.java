
public class MedianOfTwoSortedArrays {
	
/*public double findMedianSortedArrays(int[] nums1, int[] nums2) throws Exception {
	if(nums1.length == 0 && nums2.length == 0)
	{
		throw new Exception("Both arrays cannot have length 0");
	}
	
	return findMedianArrays(nums1,0,nums1.length-1,nums2,0,nums2.length-1);
    }*/

private double findMedianArrays(int[] nums1, int start1, int end1, int[] nums2, int start2, int end2) {
	// TODO Auto-generated method stub
	int length1 = end1-start1+1;
	int length2= end2-start2+1;
	if(length1 == 0 && length2 > 0) {
		return findMedian(nums2 , start2, end2);
	} else if(length2 == 0 && length1 > 0) {
		return findMedian(nums1,start1, end1);
	}
	if(length1 == 1 && length2 == 1) {
		return (nums1[start1] + nums2 [start2]) / 2d; 
	}
	 if(length1 == 1 && length2 > 1) {
		 return findMedianWithLength(nums2, start2, end2, nums1[0]);
	 }
	 if(length2 == 1 && length1 > 1) {
		 return findMedianWithLength(nums1, start1, end1, nums2[0]);
	 }
	 double median1 = findMedian(nums1, start1, end1);
	 double median2 = findMedian(nums2, start2, end2);
	 
	 if(median1 == median2)
		 return median1;
	 else if(median1 > median2) 
		 return findMedianArrays(nums1, start1, ((end1+start1) /2) , nums2, ((end2 + start2) /2), end2);
	 else
		 return findMedianArrays(nums1, ((end1+start1) /2), end1 , nums2, start2, ((end2 + start2) /2));
}

private double findMedianWithLength(int[] nums2, int start2, int end2, double i) {
	// TODO Auto-generated method stub
	double arrayMedian = findMedian(nums2, start2, end2);
	if(arrayMedian == i)
		return arrayMedian;
	if((end2 - start2) % 2 == 1)
		return findMedianForEvenCase(nums2, start2, end2, arrayMedian, i);
	
	return findMedianForOddCase(nums2, start2, end2, arrayMedian, i);
}

private double findMedianForOddCase(int[] nums2, int start2, int end2, double arrayMedian, double i) {
	// TODO Auto-generated method stub
	int mid = (start2 + end2)/2;
	if(i>nums2[mid+1])
		return (arrayMedian + nums2[mid+1]) / 2d;
	if(i < nums2[mid-1])
		return (arrayMedian + nums2[mid-1]) / 2d;
	return (arrayMedian + i) / 2d;
}

private double findMedianForEvenCase(int[] nums2, int start2, int end2, double arrayMedian, double i) {
	// TODO Auto-generated method stub
	int mid = (end2-start2)/2;
	if(arrayMedian > i) {
		double left = nums2[mid];
		return Math.max(i, left);
	} else {
		double right = nums2[mid+1];
		return Math.max(i, right);
	}
}

private double findMedian(int[] nums, int start2, int end2) {
	// TODO Auto-generated method stub
	if(start2 == end2)
		return nums[start2];
	int mid = (end2+start2) / 2;
	if((end2-start2) % 2 == 1)
		return (nums[mid] + nums[mid+1] ) /2d ;
	return nums[mid];
}
public double findMedianSortedArrays(int[] nums1, int[] nums2) throws Exception {
	if(nums1.length == 0 && nums2.length == 0)
	{
		throw new Exception("Both arrays cannot have length 0");
	}
	int len1 = nums1.length;
	int len2 = nums2.length;
	int total_length = len1 + len2;
	int mid = total_length /2;
	int i= 0, j= 0;
	while((i+j) <= mid) {
		if(nums1[i]>nums2[j])
			j++;
		else if(nums2[j]>nums1[i])
			i++;
	}
	if(total_length %2 == 1)
		return nums2[j];
	return findMedianArrays(nums1,0,nums1.length-1,nums2,0,nums2.length-1);
    }

public static void main(String args[]) throws Exception {
	int[] a = {1,2};
	int[] b = {1,2,3};
	MedianOfTwoSortedArrays m = new MedianOfTwoSortedArrays();
	System.out.println(m.findMedianSortedArrays(a, b));
}
}
