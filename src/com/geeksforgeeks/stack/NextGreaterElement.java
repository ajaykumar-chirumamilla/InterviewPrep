package com.geeksforgeeks.stack;

import java.util.Stack;

public class NextGreaterElement {
   
   public static void printNGE(int arr[]) {
      Stack<Integer> stack = new Stack<>();
      stack.push(arr[0]);
      for(int i=1;i<arr.length;i++) {
         int next = arr[i];
         int ele = stack.pop();
         while(next>ele) {
            System.out.println(ele+"--"+next);
            if(stack.isEmpty())
               break;
            ele = stack.pop();
         }
         if(next<ele)
            stack.push(ele);
         stack.push(next);
      }
      while(!stack.isEmpty())
      {
         System.out.println(stack.pop()+"--"+-1);
      }
   }
   public static void main(String[] args) 
   {
       int arr[] = { 11, 13, 21, 3 };
       printNGE(arr);
   }
}
