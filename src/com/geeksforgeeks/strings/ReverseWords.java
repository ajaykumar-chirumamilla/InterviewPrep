package com.geeksforgeeks.strings;

public class ReverseWords {
   public String reverseWords(String s) {
      if(s == null || s.length()==0)
          return s;
      s = s.trim();
      s = reverse(s,0,s.length()-1);
      int start = 0,end=0;
      StringBuilder res = new StringBuilder();
      for(int i=0;i<s.length();i++) {
          if(s.charAt(i) == ' ')
          {
             end=i-1;
             while(s.charAt(i)==' ')
                i++;
             if(s.charAt(i-1)==' ') {
                res.append(reverse(s,start,end).substring(start,end+1));
                res.append(" ");
                           start = i;
            }
          }
          
      }
                         res.append(reverse(s,start,s.length()-1).substring(start));
                         return res.toString(); 
  }
  public String reverse(String s, int start, int end) {
     char[] ch = s.toCharArray();
      for(int i=start,j=end;i<j;i++,j--) {
          char c = ch[i];
          ch[i] = ch[j];
          ch[j] = c;
      }
      return String.valueOf(ch);
  }
  public static void main(String args[]) {
     String str = "b  a";
     ReverseWords r = new ReverseWords();
     System.out.println(r.reverseWords(str));
  }
}
