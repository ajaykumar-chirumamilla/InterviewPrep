package com.geeksforgeeks.array;

public class RomanToInt {
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
         else
            return 0;
         if(sum>Integer.MAX_VALUE)
            return 0;
      }
      return (int)sum;
  }
}
