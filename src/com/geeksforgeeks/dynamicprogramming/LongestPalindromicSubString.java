package com.geeksforgeeks.dynamicprogramming;

public class LongestPalindromicSubString {
   int maxLen=1, start = 0;
   public String lps(String str) {
      for(int i=0;i<str.length();i++){
         expandAroundCenter(str,i,i);
         expandAroundCenter(str,i,i+1);
      }
      return str.substring(start, start+maxLen);
   }
   private void expandAroundCenter(String str, int low, int high) {
      // TODO Auto-generated method stub
      while(low>=0 && high <str.length() && str.charAt(low) == str.charAt(high)) {
         low--;
         high++;
      }
      if(maxLen<high-low-1)
      {
         start = low+1;
         maxLen = high-low-1;
      }
   }
   public static void main(String args[]) {
      LongestPalindromicSubString l = new LongestPalindromicSubString();
      System.out.println(l.lps("forgeeksskeegfor"));
   }
   
}
