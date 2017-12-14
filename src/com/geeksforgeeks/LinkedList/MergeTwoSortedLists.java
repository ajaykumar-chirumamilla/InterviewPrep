package com.geeksforgeeks.LinkedList;

public class MergeTwoSortedLists {
   public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }
   public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
      ListNode res = null;
      ListNode dummy = new ListNode(Integer.MIN_VALUE);
      res = dummy;
      while(l1!=null && l2!=null) {
         if(l1.val>l2.val) {
            res.next = l2;
            l2 = l2.next;
         }
         else {
            res.next = l1;
            l1 = l1.next;
         }
         res = res.next;
      }
      if(l1!=null) {
         res.next = l1;
      }
      if(l2!=null) {
         res.next = l2;
      }
      return dummy.next;
   }
}
