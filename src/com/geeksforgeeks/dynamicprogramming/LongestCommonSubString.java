package com.geeksforgeeks.dynamicprogramming;

public class LongestCommonSubString {
   public int longestCommonSubString(String str1,String str2) {
      int[][] lcs = new int[str1.length()+1][str2.length()+1];
      int result = 1;
      for(int i=0;i<=str1.length();i++) {
         for(int j=0;j<=str2.length();j++) {
            if(i == 0 || j == 0)
               lcs[i][j] = 0;
            else if(str1.charAt(i-1) == str2.charAt(j-1)) {
               lcs[i][j] = lcs[i-1][j-1]+1;
               result = Math.max(result, lcs[i][j]);
            }
            else
               lcs[i][j] = 0;
         }
      }
      return result;
   }
   public static void main(String args[]) {
      LongestCommonSubString l = new LongestCommonSubString();
      System.out.println(l.longestCommonSubString("OldSite:GeeksforGeeks.org", "NewSite:GeeksQuiz.com"));
   }
}
