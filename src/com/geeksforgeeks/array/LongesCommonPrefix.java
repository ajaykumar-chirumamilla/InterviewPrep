package com.geeksforgeeks.array;

public class LongesCommonPrefix {
   public String longestCommonPrefix(String[] strs) {
      if (strs == null || strs.length == 0)
         return "";
      int smallestLengthStr = Integer.MAX_VALUE, indexOfSmallestString = 0;
      for (int i = 0; i < strs.length; i++) {
         if (smallestLengthStr > strs[i].length()) {
            smallestLengthStr = strs[i].length();
            indexOfSmallestString = i;
         }
      }
      String lcp = strs[indexOfSmallestString].substring(0, smallestLengthStr);
      int i = 0;
      while (true) {
         for (; i < strs.length; i++) {
            if (!strs[i].startsWith(lcp)) {
               smallestLengthStr -= 1;
               lcp = lcp.substring(0, smallestLengthStr);
               i = 0;
               break;
            }

         }
         if (i == strs.length)
            return lcp;
      }
   }
}
