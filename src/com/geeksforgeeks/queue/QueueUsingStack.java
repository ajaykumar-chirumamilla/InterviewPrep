package com.geeksforgeeks.queue;

import java.util.Stack;

public class QueueUsingStack {
   Stack<Integer> stack1;
   Stack<Integer> stack2;
   public QueueUsingStack() {
      stack1 = new Stack<>();
      stack2 = new Stack<>();
   }
   public void enqueue(int x) {
      stack1.push(x);
   }
   
   public int dequeue() {
      if(stack1.isEmpty() && stack2.isEmpty())
         return -1;
      if(stack2.isEmpty()) {
         while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
         }
         return stack2.pop();
      } else
         return stack2.pop();
   }
   
   public static void main(String args[]) {
      QueueUsingStack q= new QueueUsingStack();
      q.enqueue(1);
      q.enqueue(2);
      q.enqueue(3);
      System.out.println(q.dequeue());
      System.out.println(q.dequeue());
      System.out.println(q.dequeue());
      System.out.println(q.dequeue());
   }
}
