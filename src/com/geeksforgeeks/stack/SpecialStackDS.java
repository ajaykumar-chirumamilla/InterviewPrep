package com.geeksforgeeks.stack;

import java.util.Stack;

public class SpecialStackDS {
   Stack<Integer> stack;
   Stack<Integer> min;
   public SpecialStackDS() {
      // TODO Auto-generated constructor stub
      stack = new Stack<>();
      min = new Stack<>();
   }
   void push(int x) {
      if(stack.isEmpty()) {
         stack.push(x);
         min.push(x);
      } else {
         stack.push(x);
         int y = min.pop();
         min.push(y);
         if(y>x)
            min.push(x);
      }
   }
   
   int pop() {
      if(stack.isEmpty())
         return -1;
      int temp = stack.pop();
      int x = min.pop();
      if(temp!=x)
         min.push(x);
      return temp;
   }
   
   int getMin() {
      if(stack.isEmpty())
         return -1;
      int temp = min.pop();
      min.push(temp);
      return temp;
   }
   public static void main(String[] args) 
   {
       SpecialStackDS s = new SpecialStackDS();
       s.push(10);
       s.push(20);
       s.push(30);
       System.out.println(s.getMin());
       s.push(5);
       System.out.println(s.getMin());
   }
}
