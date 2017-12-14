package com.geeksforgeeks.array;

public class RomanToInteger {
   public int romanToInteger(String roman) {
      long res = 0;
      if(roman.contains("IV")) res-=2;
      if(roman.contains("IX")) res-=2;
      if(roman.contains("XL")) res-=20;
      if(roman.contains("XC")) res-=20;
      if(roman.contains("CM")) res-=200;
      if(roman.contains("CD")) res-=200;
      for(int i=0;i<roman.length();i++) {
         char ch = roman.charAt(i);
         if(ch == 'I')
            res+=1;
         if(ch == 'V')
            res+=5;
         if(ch == 'X')
            res+=10;
         if(ch == 'L')
            res+=50;
         if(ch == 'C')
            res+=100;
         if(ch == 'D')
            res+=500;
         if(ch == 'M')
            res+=1000;
      }
      if(res>Integer.MAX_VALUE)
         return 0;
      return (int)res;
   }
   public int romanToInt(String s) {
      if(s==null)
        return 0;
    long sum = 0;
    if(s.contains("IV")) sum-=2;
    if(s.contains("IX")) sum-=2;
    if(s.contains("XL")) sum-=20;
    if(s.contains("XC")) sum-=20;
    if(s.contains("CD")) sum-=200;
    if(s.contains("CM")) sum-=200;
    char[] charArray = s.toCharArray();
    for(int i=0;i<charArray.length;i++) {
       if(charArray[i] == 'I')
          sum+=1;
       if(charArray[i] == 'V')
          sum+=5;
       if(charArray[i] == 'X')
          sum+=10;
       if(charArray[i] == 'L')
          sum+=50;
       if(charArray[i] == 'C')
          sum+=100;
       if(charArray[i] == 'D')
          sum+=500;
       if(charArray[i] == 'M')
          sum+=1000;
       if(sum>Integer.MAX_VALUE)
          return 0;
    }
    return (int)sum;
  }
   public static void main(String args[]) {
      RomanToInteger r = new RomanToInteger();
      System.out.println(r.romanToInt("MMMCMXLIX"));
   }
}
