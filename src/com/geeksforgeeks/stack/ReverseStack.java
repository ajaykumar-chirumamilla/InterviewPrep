package com.geeksforgeeks.stack;

import java.util.Stack;

public class ReverseStack {
   static Stack<Character> result = new Stack<>();
   public static void reverseStack(Stack<Character> stack) {
      if(stack.isEmpty())
         return;
      char ch = stack.peek();
      stack.pop();
      reverseStack(stack);
      System.out.println(ch);
      insertAtBotton(ch);
   }
   public static void insertAtBotton(char x) {
      if(result.isEmpty())
         result.push(x);
         else {
            char ch = result.peek();
            result.pop();
            insertAtBotton(x);
            result.push(ch);
         }
   }
   public static void main(String[] args) 
   {
        //push elements into the stack
      Stack<Character> st = new Stack<>();
       st.push('1');
       st.push('2');
       st.push('3');
       st.push('4');
        
       System.out.println("Original Stack");
        
       System.out.println(st);
        
       //function to reverse the stack
       reverseStack(st);
        
       System.out.println("Reversed Stack");
        
       System.out.println(result);
   }

}
