package com.geeksforgeeks.matrix;

public class MatrixSpiralForm {
   public void printSpiralForma(int[][] arr) {
      int height = arr.length;
      int width = arr[0].length;
      
      int i=0, j=0,printedRows = 0,printedCols = 0, k=0,l=0;
      do {
         
         while(j<width)
         {
            System.out.print(arr[i][j]+"\t");
            j++;
         }
         System.out.println();
         j-=1;
         i++;
         while(i<height)
         {
            System.out.print(arr[i][j]+"\t");
            i++;
         }
         System.out.println();
         printedRows+=1;
         j-=1;
         i-=1;
         if(k<height)
         while(j>=l) {
            System.out.print(arr[i][j]+"\t");
            j--;
         }
         System.out.println();
         j+=1;
         i-=1;
         printedCols+=1;
         if(l<width)
         while(i>=k) {
            System.out.print(arr[i][j]+"\t");
            i--;
         }
         System.out.println();
         i = ++k;
         j = ++l;
         height--;
         width--;
      }while(k<height && l<width);
      
   }
   
   public static void main(String args[]) {
      int a[][] = { {1, 2, 3, 4, 5},
                    {6, 7, 8, 9, 10},
                    {11, 12, 13, 14, 15},
                    {16, 17, 18, 19, 20}
          };
      MatrixSpiralForm m = new MatrixSpiralForm();
      m.printSpiralForma(a);
   }
}
