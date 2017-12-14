package com.geeksforgeeks.array;

import java.util.ArrayList;
import java.util.List;

public class ContainsDuplicate {
   public void containsDup(int[] arr){
      List<Integer> res = new ArrayList<>();
      for(int i=0;i<arr.length;i++) {
         if(arr[Math.abs(arr[i])-1]>0)
         arr[Math.abs(arr[i])-1] = -arr[Math.abs(arr[i])-1];
      }
      for(int i=0;i<arr.length;i++) {
         if(arr[i]>0)// = -arr[Math.abs(arr[i])]; {
            res.add(i+1);
      }
      for(int i=0;i<res.size();i++)
         System.out.print(res.get(i)+"\t");
   }
   public void disappearedEle(int[] arr){
      List<Integer> res = new ArrayList<>();
      for(int i=1;i<=arr.length;i++) {
         res.add(i);
      }
      for(int i=0;i<arr.length;i++) {
         if(res.contains(arr[i]))
            res.remove((Object)arr[i]);
      }
      for(int i=0;i<res.size();i++)
         System.out.print(res.get(i)+"\t");
   }
   public static void main(String args[]) {
      ContainsDuplicate c = new ContainsDuplicate();
      int[] arr = {4,3,2,7,8,2,3,1};
      c.disappearedEle(arr);
   }
}
