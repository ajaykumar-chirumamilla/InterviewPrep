package com.geeksforgeeks.Trie;

import java.util.HashMap;

public class TrieImplementation {
   
   class TrieNode {
      char ch;
      HashMap<Character, TrieNode> children;
      boolean isEnd;
      
      public TrieNode(char c) {
         ch = c;
         children = new HashMap<Character, TrieNode>();
         isEnd = false;
      }
      
      public TrieNode() {
         children = new HashMap<Character, TrieNode>();
         isEnd = false;
      }
   }
   
   TrieNode root;
   public TrieImplementation() {
      root = new TrieNode();
  }
   public void add(String str) {
      TrieNode current = root;
      if(str != null && str.length() > 0) {
         for(int i=0;i<str.length();i++) {
            HashMap<Character, TrieNode> children = current.children;
            if(!children.containsKey(str.charAt(i))) {
               TrieNode node = new TrieNode(str.charAt(i));
               current.children.put(str.charAt(i), node);
            } 
               current = current.children.get(str.charAt(i));
         }
         current.isEnd = true;
      }
      
   }
   
   public void longestPrefixMatching(String str) {
      TrieNode current = root;
      String result = "";
      int prevMatch = 0;
      for(int i=0;i<str.length();i++) {
         HashMap<Character, TrieNode> node = current.children;
         if(node.containsKey(str.charAt(i))) {
            current = node.get(str.charAt(i));
            result += str.charAt(i);
            if(current.isEnd)
               prevMatch = i+1;
         } else {
            break;
         }
      }
      if( !current.isEnd)
         System.out.println(result.substring(0, prevMatch));
      else
      System.out.println(result+"\t"+prevMatch);
   }
   
   public static void main(String[] args) {
      TrieImplementation dict = new TrieImplementation();
      dict.add("are");
      dict.add("area");
      dict.add("base");
      dict.add("cat");
      dict.add("cater");
      dict.add("basement");
      dict.longestPrefixMatching("cater");
   }
}
