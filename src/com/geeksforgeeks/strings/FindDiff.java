package com.geeksforgeeks.strings;

import java.util.Arrays;

public class FindDiff {
   public char findTheDifference(String s, String t) {
      if(s == null || t == null)
          return '-';
      char[] chars = s.toCharArray();
      Arrays.sort(chars);
      s = String.valueOf(chars);
      chars = t.toCharArray();
      Arrays.sort(chars);
      t = String.valueOf(chars);
      int j=0,i=0;
      for(i=0,j=0;(i<s.length() && j<t.length());i++,j++) {
          if(s.charAt(i)!=t.charAt(i))
              return t.charAt(j);
      }
      if(j!=t.length())
         return t.charAt(j);
      return '-';
  }
   public static void main(String args[]) {
      FindDiff f = new FindDiff();
      System.out.println(f.findTheDifference("acdb","aecbd"));
   }
}
