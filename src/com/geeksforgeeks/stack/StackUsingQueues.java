package com.geeksforgeeks.stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
   
   Queue<Integer> q1;
   Queue<Integer> q2;
   
   public StackUsingQueues() {
      q1 = new LinkedList<>();
      q2 = new LinkedList<>();
   }
   
   public void push(int x) {
      q2.add(x);
      while(!q1.isEmpty())
         q2.add(q1.remove());
      Queue<Integer> temp = q2;
      q2 = q1;
      q1 = temp;
   }
   
   public int pop() {
      if(q1.isEmpty())
         return -1;
      return q1.remove();
   }
   
   public static void main(String[] args) {
      StackUsingQueues s1 = new StackUsingQueues();
      //       Stack s1 = new Stack();
      s1.push(1);
      s1.push(2);
      s1.push(3);
      s1.push(4);
      s1.push(5);
      s1.push(6);
      s1.push(7);
      s1.push(8);
      s1.push(9);
      s1.push(10);
      // s1.push(6);
      System.out.println("1st = " + s1.pop());
      System.out.println("2nd = " + s1.pop());
      System.out.println("3rd = " + s1.pop());
      System.out.println("4th = " + s1.pop());
      System.out.println("5th = " + s1.pop());
      System.out.println("6th = " + s1.pop());
      System.out.println("7th = " + s1.pop());
      System.out.println("8th = " + s1.pop());
      System.out.println("9th = " + s1.pop());
      System.out.println("10th= " + s1.pop());
  }

}
