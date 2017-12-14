package com.geeksforgeeks.binarysearchtree;

public class SizeOfBST {
   public int size(TreeNode root) {
      if(root == null)
         return 0;
      int left = size(root.left);
      int right = size(root.right);
      return left+right+1;
   }
}
