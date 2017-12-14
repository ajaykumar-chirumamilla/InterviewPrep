package com.geeksforgeeks.dynamicprogramming;

public class LongestPalindromicSubsequence {
   public int lps(String str) {
      int[][] lps = new int[str.length()][str.length()];
      for(int i=0;i<str.length();i++)
         lps[i][i] = 1;
      for(int len = 2;len<=str.length();len++) {
         for(int i=0;i<str.length()-len+1;i++) {
            int j = i+len-1;
            if(str.charAt(i) == str.charAt(j) && len==2)
               lps[i][j] = 2;
            else if(str.charAt(i) == str.charAt(j))
               lps[i][j] = lps[i+1][j-1]+2;
            else
               lps[i][j] = Math.max(lps[i][j-1], lps[i+1][j]);
          }
      }
      return lps[0][str.length()-1];
   }
   public static void main(String args[]) {
      LongestPalindromicSubsequence l = new LongestPalindromicSubsequence();
      System.out.println(l.lps("GEEKS FOR GEEKS"));
   }
}
