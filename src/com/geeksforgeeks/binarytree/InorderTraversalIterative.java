package com.geeksforgeeks.binarytree;

import java.util.Stack;

public class InorderTraversalIterative {
   Stack<Node> stack = new Stack<>();
   Node root=  null;
   public void iteratievInorder(Node current) {
      while(current!=null || !stack.isEmpty()) {
         while(current!=null) {
            stack.push(current);
            current = current.left;
         }
         if(current==null) {
            Node temp = stack.pop();
            System.out.print(temp.data+"\t");
            current = temp.right;
         }
      }
   }
   public static void main(String args[]) {
      
      /* creating a binary tree and entering 
       the nodes */
      InorderTraversalIterative tree = new InorderTraversalIterative();
      tree.root = new Node(1);
      tree.root.left = new Node(2);
      tree.root.right = new Node(3);
      tree.root.left.left = new Node(4);
      tree.root.left.right = new Node(5);
      tree.root.left.right.left = new Node(6);
      tree.iteratievInorder(tree.root);
  }
}
