package com.geeksforgeeks.binarytree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class TreeTraversalsIterative {
   public List<Integer> preOrder(TreeNode root) {
      List<Integer> res = new ArrayList<>();
      if(root == null)
         return res;
      Deque<TreeNode> stack = new LinkedList<>();
      TreeNode current = root;
      stack.addFirst(current);
      while(!stack.isEmpty()) {
         current  = stack.poll();
         
         res.add(current.data);
         
         if(current.right!=null)
            stack.addFirst(current.right);
         if(current.left!=null)
            stack.addFirst(current.left);
      }
      return res;
   }
   
   public List<Integer> inorder(TreeNode root) {
      List<Integer> res = new ArrayList<>();
      if(root == null)
         return res;
      Deque<TreeNode> stack = new LinkedList<>();
      TreeNode current = root;
      while(!stack.isEmpty() || current!=null) {
         if(current!=null) {
            stack.addFirst(current);
            current = current.left;
         } else {
            current = stack.poll();
            res.add(current.data);
            current = current.right;
         }
      }
      return res;
   }
   
   public List<Integer> postOrder(TreeNode root) {
      List<Integer> res = new ArrayList<>();
      if(root == null)
         return res;
      Deque<TreeNode> stack = new LinkedList<>();
      TreeNode current = root;
      TreeNode lastVisited = null;
      while(!stack.isEmpty() || current!=null) {
         if(current!=null) {
            stack.addFirst(current);
            current = current.left;
         } else {
            TreeNode peekNode = stack.peek();
            if(peekNode.right!=null && lastVisited!=peekNode.right){
               current = peekNode.right;
            } else {
               res.add(peekNode.data);
               lastVisited = stack.poll();
            }
         }
      }
      return res;
   }
   
}
