package com.geeksforgeeks.array;

public class LeadersInArray {
   public void leadersInArray(int arr[]) {
      int prev_max = 0;
      for(int i=arr.length-1;i>=0;i--) {
         if(arr[i] > prev_max) {
            System.out.println(arr[i]);
            prev_max = arr[i];
         }
      }
   }
}
