package com.geeksforgeeks.strings;

import java.util.ArrayList;
import java.util.Arrays;

public class AnagramsTogether {
   public static ArrayList<ArrayList<String>> anagramsTogether(ArrayList<String> list) {
      ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
      ArrayList<String> seenStrings = new ArrayList<String>();
      for(int i=0;i<list.size();i++) {
         String str = list.get(i);
         
         if(!seenStrings.contains(str)) {
            ArrayList<String> res = new ArrayList<>();
            res.add(str);
         seenStrings.add(str);
         for(int j=i+1;j<list.size();j++) {
            if(Anagram.areAnagrams(str, list.get(j))) {
               res.add(list.get(j));
               seenStrings.add(list.get(j));
            }
         }
         result.add(res);
         }
        
      }
      return result;
   }
   public static void main(String args[]) {
      String[] wordArr = {"cat", "dog", "tac", "god", "act","sjdhgy","sjdhgy"};
      ArrayList<String> input = new ArrayList<>(Arrays.asList(wordArr));
      System.out.println(anagramsTogether(input));
   }
}
