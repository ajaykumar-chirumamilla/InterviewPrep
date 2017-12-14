package com.geeksforgeeks.stack;

import java.util.Stack;

public class CheckForBalancedParanthesis {
   public static boolean checkBalParanthesis(char exp[]) {
      Stack<Character> stack = new Stack<>();
      for(int i=0;i<exp.length;i++) {
         if(exp[i] == '(' || exp[i] == '[' || exp[i] == '{') {
            stack.push(exp[i]);
         } else if(exp[i] == ')' || exp[i] == ']' || exp[i] == '}') {
            if(stack.isEmpty())
               return false;
            char ch = stack.pop();
            if(ch == ')' && exp[i]!='(') {
               return false;
         } else if(ch == ']' && exp[i] !='[') {
               return false;
         }
         else if(ch =='}' && exp[i]!='{') {
               return false;
         }
            
         }
      }
      return true;
   }
   public static void main(String[] args) 
   {
       char exp[] = {'{','(',')','}','[',']'};
         if (checkBalParanthesis(exp))
           System.out.println("Balanced ");
         else
           System.out.println("Not Balanced ");  
   }
}
