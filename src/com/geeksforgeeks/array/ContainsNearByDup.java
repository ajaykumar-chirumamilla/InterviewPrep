package com.geeksforgeeks.array;

import java.util.ArrayList;
import java.util.HashMap;

public class ContainsNearByDup {
   public boolean containsNearbyDuplicate(int[] nums, int k) {
      HashMap<Integer,ArrayList<Integer>> temp = new HashMap<Integer,ArrayList<Integer>>();
      for(int i=0;i<nums.length;i++) {
          if(temp.containsKey(nums[i])) {
              for(int j=0;j<temp.get(nums[i]).size();j++) {
                  if(i-temp.get(nums[i]).get(j)<=k)
                      return true;
                   
              }
              ArrayList<Integer> list = temp.get(nums[i]);
              list.add(i);
              temp.put(nums[i],list);
          }
           ArrayList<Integer> list=new ArrayList<Integer>();
              list.add(i);
              temp.put(nums[i],list);
          }
      return false;
      }
   public boolean isStrobogrammatic(String num) {
         String res = "";
         for(int i=0;i<num.length();i++) {
             int n = num.charAt(i)-'0';
             if(n == 6)
                 res="9"+res;
             if(n == 9)
                 res="6"+res;
             if(n == 1)
                 res="1"+res;
             if(n == 8)
                 res="8"+res;
             if(n == 0)
                res="0"+res;
         }
         System.out.println(res);
         return num.equals(res);
  }
   public static void main(String args[]) {
      int[] nums = {-1,-1};
      ContainsNearByDup c = new ContainsNearByDup();
      System.out.println(c.containsNearbyDuplicate(nums, 1));
      System.out.println(c.isStrobogrammatic("101"));
   }
}
