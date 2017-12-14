package com.geeksforgeeks.strings;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar {
   class CountIndex {
      int index, count;
      public CountIndex(int index) {
          this.index = index;
          this.count = 1;
      }
      public void incCount() {
          this.count++;
      }
  }
  
  public int firstUniqChar(String s) {
      if(s == null || s.length() == 0)
          return -1;
       HashMap<Character,CountIndex> temp  =new HashMap<Character,CountIndex>();
      int j=-1;
      for(int i=0;i<s.length();i++) {
          if(temp.containsKey(s.charAt(i))) {
             System.out.println("here");
              CountIndex c = temp.get(s.charAt(i));
              c.incCount();
              System.out.println(c.index+"\t"+c.count);
              temp.put(s.charAt(i),c);
          } else
          temp.put(s.charAt(i),new CountIndex(i));
      }
      int resIndex = Integer.MAX_VALUE;
      for(Map.Entry<Character,CountIndex> entry:temp.entrySet()) {
         System.out.println(entry.getKey()+"\t"+entry.getValue().count);
          if(resIndex>entry.getValue().index && entry.getValue().count == 1)
              resIndex = entry.getValue().index;
      }
      if(resIndex == Integer.MAX_VALUE)
          return -1;
      return resIndex;
  }
  
  public static void main(String args[]) {
     FirstUniqueChar f = new FirstUniqueChar();
     System.out.println(f.firstUniqChar("cc"));
  }
  
}
