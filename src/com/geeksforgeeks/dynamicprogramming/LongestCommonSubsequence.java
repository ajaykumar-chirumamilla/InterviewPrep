package com.geeksforgeeks.dynamicprogramming;

public class LongestCommonSubsequence {
   public int lcs(String str1,String str2) {
      int[][] lcs = new int[str1.length()+1][str2.length()+1];
      for(int i=0;i<=str1.length();i++) {
         for(int j=0;j<=str2.length();j++) {
            if(i==0 || j==0)
               lcs[i][j]=0;
            else if(str1.charAt(i-1)==str2.charAt(j-1))
               lcs[i][j] = lcs[i-1][j-1]+1;
            else
               lcs[i][j] = Math.max(lcs[i][j-1], lcs[i-1][j]);
         }
      }
      return lcs[str1.length()][str2.length()];
   }
   public static void main(String args[]) {
      LongestCommonSubsequence lcs = new LongestCommonSubsequence();
      System.out.println(lcs.lcs("AGGTAB", "GXTXAYB"));
   }
}  
