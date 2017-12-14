package com.geeksforgeeks.binarysearchtree;

import java.util.ArrayList;

public class RootToLeafSum {
   TreeNode root;
   public RootToLeafSum() {
      // TODO Auto-generated constructor stub
      root = null;
   }
   public boolean findPathSum(TreeNode root, int sum, ArrayList<Integer> result) {
      if(root == null)
         return false;
      if(root.left == null && root.right == null) {
         if(sum == root.data) {
            result.add(root.data);
            return true;
         }
         else  {
            return false;
         }
      }
      if(findPathSum(root.left, sum-root.data, result)) {
         result.add(root.data);
         return true;
      }
      if(findPathSum(root.right, sum - root.data, result)) {
         result.add(root.data);
         return true;
      }
         return false;
   }
   
   public boolean isExistsPathsum(TreeNode root, int sum) {
      if(root == null)
         return false;
      if(root.data == sum && root.right == null && root.left == null)
         return true;
      return isExistsPathsum(root.left, sum-root.data) || isExistsPathsum(root.right, sum-root.data);
   }
   
   public static void main(String[] args)
   {
      ArrayList<Integer> result = new ArrayList<>();
       RootToLeafSum tree = new RootToLeafSum();
       tree.root = new TreeNode(10);
       tree.root.left = new TreeNode(16);
       tree.root.right = new TreeNode(5);
       tree.root.left.right = new TreeNode(-3);
       tree.root.right.left = new TreeNode(6);
       tree.root.right.right = new TreeNode(11);
       tree.findPathSum(tree.root, 26, result);
       System.out.println(result);
   }
}  
