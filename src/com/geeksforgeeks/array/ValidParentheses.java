package com.geeksforgeeks.array;

import java.util.Stack;

public class ValidParentheses {
   public boolean isValid(String s) {
      if(s == null)
         return false;
      if(s.length() == 0)
         return true;
      Stack<Character> temp = new Stack<>();
      char[] charArray = s.toCharArray();
      for(int i=0;i<charArray.length;i++) {
         if(charArray[i] == '(' || charArray[i] == '{' || charArray[i] == '[') {
            temp.push(charArray[i]);
         } else {
            if(!checkValidParentheses(temp,charArray[i]))
               return false;
         }
      }
      if(temp.isEmpty())
         return true;
      return false;
   }

   private boolean checkValidParentheses(Stack<Character> temp, char c) {
      // TODO Auto-generated method stub
      if(temp.isEmpty())
         return false;
      char ch = temp.pop();
      if(c == ')' && ch == '(')
         return true;
      if(c == ']' && ch == '[')
         return true;
      if(c == '}' && ch == '{')
         return true;
      return false;
   }
}
