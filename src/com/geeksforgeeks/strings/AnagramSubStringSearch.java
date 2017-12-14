package com.geeksforgeeks.strings;

import java.util.ArrayList;

public class AnagramSubStringSearch {
   public static ArrayList<Integer> search(String pat, String txt) {
      ArrayList<Integer> result;
      if(txt.length()>pat.length())
         return new ArrayList<>();
      result = new ArrayList<>();
      int i=0;
      while((i+txt.length())<=pat.length()) {
         if(Anagram.areAnagrams(pat.substring(i, i+txt.length()), txt)) {
            result.add(i);
         }
         i++;
      }
      return result;
   }
   
   public static ArrayList<Integer> search2(String pat,String txt) {
      if(txt.length()>pat.length())
         return new ArrayList<Integer>();
      int[] storePat = new int[256];
      int[] storeTxt = new int[256];
      for(int i=0;i<txt.length();i++) {
         storePat[pat.charAt(i)]++;
         storeTxt[txt.charAt(i)]++;
      }
      ArrayList<Integer> result = new ArrayList<>();
      for(int i=txt.length();i<pat.length();i++) {
         if(compare(storePat, storeTxt)) {
            result.add(i-txt.length());
         }
         storePat[pat.charAt(i)]++;
         storePat[pat.charAt(i-txt.length())]--;
            
      }
      if(compare(storePat, storeTxt))
         result.add(pat.length()-txt.length());
      return result;
   }
   
   public static boolean compare(int[] arr1, int[] arr2) {
      for(int i=0;i<arr1.length;i++) {
         if(arr1[i]!=arr2[i])
            return false;
      }
      return true;
   }
   public static void main(String args[]) {
      String txt = "BACDGABCDA";
      String pat = "ABCD";
      System.out.println(search2(txt, pat));
   }
}
