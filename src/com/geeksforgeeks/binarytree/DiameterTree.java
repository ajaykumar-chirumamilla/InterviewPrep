package com.geeksforgeeks.binarytree;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class DiameterTree {
      public int diameter(Node root) {
         if(root==null)
            return 0;
         int leftHeight = 0,rightHeight = 0, leftDiameter = 0, rightDiameter = 0;
         leftHeight = getHeight(root.left);
         rightHeight = getHeight(root.right);
         leftDiameter = diameter(root.left);
         rightDiameter = diameter(root.right);
         return Math.max(leftHeight+rightHeight+1, Math.max(leftDiameter,rightDiameter));
      }

      private int getHeight(Node n) {
         // TODO Auto-generated method stub
         if(n == null)
            return 0;
         return 1+Math.max(getHeight(n.left), getHeight(n.right));
      }
}  
