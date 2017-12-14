package com.geeksforgeeks.binarytree;

class TreeNode {
   public int data;
   public TreeNode left, right;
   public TreeNode(int d) {
      data = d;
      left = right = null;
   }
}
public class TreeTraversals {
   TreeNode root;
   public TreeTraversals() {
      // TODO Auto-generated constructor stub
      root=null;
   }
   public void preorder(TreeNode node) {
      if(node==null)
         return;
      System.out.print(node.data+"\t");
      preorder(node.left);
      preorder(node.right);
   }
   
   public void inorder(TreeNode node) {
      if(node==null)
         return;
      inorder(node.left);
      System.out.print(node.data+"\t");
      inorder(node.right);
   }
   
   public void postorder(TreeNode node) {
      if(node==null)
         return;
      postorder(node.left);
      postorder(node.right);
      System.out.print(node.data+"\t");
   }
   public static void main(String[] args)
   {
       TreeTraversals tree = new TreeTraversals();
       tree.root = new TreeNode(1);
       tree.root.left = new TreeNode(2);
       tree.root.right = new TreeNode(3);
       tree.root.left.left = new TreeNode(4);
       tree.root.left.right = new TreeNode(5);

       System.out.println("Preorder traversal of binary tree is ");
       tree.preorder(tree.root);

       System.out.println("\nInorder traversal of binary tree is ");
       tree.inorder(tree.root);

       System.out.println("\nPostorder traversal of binary tree is ");
       tree.postorder(tree.root);
   }
}
