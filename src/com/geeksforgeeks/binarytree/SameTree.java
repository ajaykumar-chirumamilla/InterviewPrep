package com.geeksforgeeks.binarytree;

public class SameTree {
   public boolean isSameTree(TreeNode p, TreeNode q) {
      if(p == null && q == null)
         return true;
      else if(p!=null && q!=null) {
         if(p.data == q.data) {
            return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
         }
      } else
         return false;
      return false;
   }
}
