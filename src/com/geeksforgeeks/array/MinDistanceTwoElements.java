package com.geeksforgeeks.array;

public class MinDistanceTwoElements {
   public int minDistance(int arr[], int x, int y) {
      int prev = 0, i=0;
      for(i=0;i<arr.length;i++) {
         if(arr[i] == x || arr[i] == y) {
            prev = i;
            break;
         }
      }
      int min_dist = Integer.MAX_VALUE;
      for(;i<arr.length;i++) {
         if(arr[i] == x || arr[i] == y) {
         if(arr[prev] != arr[i] && i-prev<min_dist) {
            min_dist = i-prev;
            prev = i;
         } else
            prev = i;
      }
      }
      return min_dist;
   }
}
