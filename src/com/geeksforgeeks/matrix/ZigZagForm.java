package com.geeksforgeeks.matrix;

public class ZigZagForm {
   
   public void printZigZag(int arr[][]) {
      int i=0,j=0;
      int height = arr.length;
      int width = arr[0].length;
      for(i=0;i<height;i+=1) {
         j = 0;
         while(j<width) {
            System.out.print(arr[i][j]+"\t");
            j++;
         }
         System.out.println();
         j-=1;
         i+=1;
         if(i>=height)
            break;
         while(j>=0) {
            System.out.print(arr[i][j]+"\t");
            j--;
         }
         System.out.println();
      }
   }
   
   public static void main(String args[]) {
      int mat[][] = { {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20}
          };
 
ZigZagForm z = new ZigZagForm();
z.printZigZag(mat);
   }
}  
