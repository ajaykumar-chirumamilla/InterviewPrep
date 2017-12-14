package com.geeksforgeeks.stack;

import java.util.Stack;

public class SortStack {
   public static void sortStack(Stack<Integer> stack) {
      if(!stack.isEmpty()) {
         int i = stack.pop();
         sortStack(stack);
         sortedInsert(stack, i);
      }
   }

   private static void sortedInsert(Stack<Integer> stack, int temp) {
      // TODO Auto-generated method stub
      if(stack.isEmpty() || temp < stack.peek()) {
         stack.push(temp);
         return;
      }
      int x = stack.pop();
      sortedInsert(stack, temp);
      stack.push(x);
   }
   
   public static void main(String[] args) 
   {
       Stack<Integer> s = new Stack<>();
       s.push(30);
       s.push(-5);
       s.push(18);
       s.push(14);
       s.push(-3);
     
       System.out.println("Stack elements before sorting: ");
       System.out.println(s);
     
       sortStack(s);
     
       System.out.println(" \n\nStack elements after sorting:");
       System.out.println(s);
     
   }
}
