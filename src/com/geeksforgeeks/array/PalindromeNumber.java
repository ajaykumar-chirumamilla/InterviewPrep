package com.geeksforgeeks.array;

public class PalindromeNumber {
   public boolean isPalindrome(int x) {
      if(x<0)
         return false;
      int temp = x;
      long rev = 0;
      while(temp>0)
      {
         int t = temp%10;
         rev = (rev*10)+t;
         if(rev>Integer.MAX_VALUE)
            return false;
         temp = temp/10;
      }
      if(x == (int) rev)
         return true;
      return false;
   }
}
