package com.geeksforgeeks.strings;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
   public static boolean areAnagrams(String s, String p) {
      if(s.length()!=p.length())
         return false;
      HashMap<Character, Integer> alphabets = new HashMap<>();
      for(int i=0;i<s.length();i++) {
         if(alphabets.containsKey(s.charAt(i))) {
            int val = alphabets.get(s.charAt(i));
            alphabets.put(s.charAt(i), val+1);
         } else {
            alphabets.put(s.charAt(i), 1);
         }
      }
      
      for(int i=0;i<p.length();i++) {
         
         if(alphabets.containsKey(p.charAt(i))) {
            int val = alphabets.get(p.charAt(i));
            val = val-1;
            if(val<0)
               return false;
            alphabets.put(p.charAt(i), val);
         } else
            return false;
         
      }
      for(Map.Entry<Character, Integer> entry:alphabets.entrySet()) {
         if(entry.getValue()>0)
            return false;
      }
      return true;
   }
   
   public static boolean areAnagrams2(String s, String p) {
      if(s.length()!=p.length())
         return false;
      char[] alphabets = new char[256];
      for(int i=0;i<s.length();i++) {
         alphabets[s.charAt(i)]++;
      }
      for(int i=0;i<p.length();i++) {
         alphabets[p.charAt(i)]--;
      }
      for(int i=0;i<alphabets.length;i++)
      {
         if(alphabets[i]!=0)
            return false;
      }
      return true;
   }
   public static void main(String args[]) {
      String str1 = "geeksforgeeks";
      String str2 = "forgeeksgeeks";
      if (areAnagrams2(str1, str2) )
        System.out.println("The two strings are anagram of each other");
      else
         System.out.println("The two strings are not anagram of each other");
   }
}
