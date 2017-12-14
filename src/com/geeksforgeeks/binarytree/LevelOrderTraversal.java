package com.geeksforgeeks.binarytree;

import java.util.LinkedList;
import java.util.Queue;

class Node {
   int data;
   Node left, right;
   Node(int d) {
      data = d;
      left = right = null;
   }
}
public class LevelOrderTraversal {
   Node root;
   public LevelOrderTraversal() {
      // TODO Auto-generated constructor stub
      root=null;
   }
     public void levelOrderTraversal(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()) {
           //System.out.println(q);
           Node n = q.remove();
           if(n!=null) {
           System.out.print(n.data);
           if(n.left!=null) {
              q.add(n.left);
           } if(n.right!=null) {
              q.add(n.right);
           }if(n.left!=null || n.right!=null) {
              q.add(null);
           }
           } else {
              System.out.println();
           }
          
        }
     }
     public static void main(String args[]) 
     {
         /* creating a binary tree and entering 
          the nodes */
         LevelOrderTraversal tree_level = new LevelOrderTraversal();
         tree_level.root = new Node(1);
         tree_level.root.left = new Node(2);
         tree_level.root.right = new Node(3);
         tree_level.root.left.left = new Node(4);
         tree_level.root.left.left.left = new Node(6);
         tree_level.root.left.right = new Node(5);
  
         System.out.println("Level order traversal of binary tree is - ");
         tree_level.levelOrderTraversal(tree_level.root);
     }
}
