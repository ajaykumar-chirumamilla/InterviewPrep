package com.geeksforgeeks.LinkedList;

class RandomListNode {
        int label;
        RandomListNode next, random;
        RandomListNode(int x) { this.label = x; }
    };

public class Clonerandomn {
   public RandomListNode copyRandomList(RandomListNode head) {
      RandomListNode res = head;
      while(res!=null) {
         RandomListNode r = new RandomListNode(res.label);
         r.next = res.next;
         res.next = r;
         res = res.next.next;
      }
      res = head;
      while(res!=null) {
         res.next.random = res.random.next;
         res = res.next.next;
      }
      RandomListNode dummy = new RandomListNode(Integer.MIN_VALUE);
      res = head;
      RandomListNode result = dummy,copy;
      while(res!=null) {
         //copy = res.next;
         result.next = res.next;
         result = res.next;
         res.next  = res.next.next;
         res = res.next;
      }
      return dummy.next;
   }
}
