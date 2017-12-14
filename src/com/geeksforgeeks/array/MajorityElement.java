package com.geeksforgeeks.array;

public class MajorityElement {

   //Moore's Voting Algo
   public int getMajorityElement(int arr[]) {
      int maj_index = 0, count = 1;
      for(int i=1;i<arr.length;i++) {
         if(arr[i] == arr[maj_index]) {
            count++;
         } else
            count--;
         if(count == 0) {
            maj_index = i;
            count = 1;
         }
      }
      return arr[maj_index];
   }
}  
