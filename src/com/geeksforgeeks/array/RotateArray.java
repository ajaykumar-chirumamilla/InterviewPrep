package com.geeksforgeeks.array;

public class RotateArray {
   public static void rotateArray(int[] nums, int k) {
      k%=nums.length;
    for(int i=0,j=nums.length-1;i<j;i++,j--) {
       int temp = nums[i];
       nums[i] = nums[j];
       nums[j] = temp;
    }
    for(int i=0,j=k-1;i<j;i++,j--) {
       int temp = nums[i];
       nums[i] = nums[j];
       nums[j] = temp;
    }
    for(int i=k,j=nums.length-1;i<j;i++,j--) {
       int temp = nums[i];
       nums[i] = nums[j];
       nums[j] = temp;
    }
    for(int i=0;i<nums.length;i++) {
       System.out.print(nums[i]+"\t");
    }
   }
   public static void main(String args[]) {
      int[] inp = {1,2,3,4,5,6,7};
      rotateArray(inp,3);
   }
} 
