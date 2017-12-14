package com.geeksforgeeks.array;

import java.util.HashSet;

public class ReverseInteger {
   public int reverse(int x) {
      long res = 0;
      boolean isNeg = x>0?false:true;
      if(isNeg)
         x = x*-1;
      while(x>0) {
         int temp = x%10;
         res = (res*10)+temp;
         if(res>Integer.MAX_VALUE)
            return 0;
         x = x/10;
      }
      if(isNeg)
         return (int) (res*-1);
      return (int) res;
   }
}
