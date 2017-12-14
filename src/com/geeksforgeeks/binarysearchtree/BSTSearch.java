package com.geeksforgeeks.binarysearchtree;


class TreeNode {
   public int data;
   public TreeNode left, right;
   public TreeNode(int d) {
      data = d;
      left = right = null;
   }
}

public class BSTSearch {
   public TreeNode search(TreeNode root, int key) {
      if(root == null) return null;
      if(root.data == key) return root;
      else if(root.data>key)
         return search(root.left, key);
      else if(root.data<key)
         return search(root.right, key);
      return null;
      
   }
}
