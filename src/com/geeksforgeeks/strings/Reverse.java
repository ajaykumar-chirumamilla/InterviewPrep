package com.geeksforgeeks.strings;

import java.util.Arrays;

public class Reverse {
   public static String reverseString(String s) {
      if(s == null || s.length() == 0)
          return "";
      char[] input = s.toCharArray(); 
      for(int i=0,j=input.length-1;i<j;i++,j--) {
          char temp = input[i];
          input[i] = input[j];
          input[j] = temp;
      }
      return new String(input);
   }
   
   public static String reverseCharArray(char[] input) {
      if(input == null || input.length == 0)
          return ""; 
      for(int i=0,j=input.length-1;i<j;i++,j--) {
          char temp = input[i];
          input[i] = input[j];
          input[j] = temp;
      }
      return new String(input);
   }
   
   public static String reverseWords(String s) {
      if(s == null || s.length() == 0)
         return "";
      String[] input = s.trim().split("\\s+");
      StringBuilder result = new StringBuilder();
      for(int i=input.length-1;i>=0;i--) {
         result.append(input[i]);
          if(i-1>=0)
            result.append(" ");
      }
      return result.toString();
   }
   public static String reverseWords2(char[] s) {
      if(s == null || s.length == 0)
         return "";
      int noOfSpaces=0;
      for(int i=0;i<s.length;i++) {
         if(s[i]==' ')
            noOfSpaces++;
      }
      System.out.println(noOfSpaces);
      String[] result = new String[noOfSpaces+1];
      int i=0,len = noOfSpaces;
      String first="";
      while(i<s.length) {
        first="";
         while(i<s.length && s[i]!=' ') {
            first+=s[i];
            i++;
         }
         if(i<s.length && s[i]==' ') {
         result[len] = first;
         i++;
         len--;
         }
      }
      result[0]=first;
      return Arrays.toString(result);
   }
   
   public static String reverseWords3(char[] s) {
      String reverse = reverseCharArray(s);
      char[] inp = reverse.toCharArray();
      StringBuilder res = new StringBuilder();
      reverse="";
      for(int i=0;i<inp.length;i++) {
         if(inp[i]!=' ')
            reverse += inp[i];
         else {
            res.append(reverseString(reverse));
            res.append(" ");
            reverse="";
         }
      }
      res.append(reverseString(reverse));
      return res.toString();
   }
   
   public static void main(String args[]) {
      String inp = "the sky is blue";
      System.out.println(reverseWords3(inp.toCharArray()));
   }
}
