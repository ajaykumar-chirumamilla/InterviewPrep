package com.geeksforgeeks.array;

public class MinCost {
   public int minCost(int[][] costs) {
      if(costs.length<1)
          return 0;
      int minCost = 0;
      minCost = Math.min(Math.min(costs[0][0],costs[0][1]),costs[0][2]);
      int prevIndex = 0;
      if(costs[0][0] == minCost)
          prevIndex = 0;
          else if(costs[0][1] == minCost)
          prevIndex = 1;
              else if(costs[0][2] == minCost)
          prevIndex = 2;
      for(int i=1;i<costs.length;i++) {
          int min = Integer.MAX_VALUE;
          for(int j=0;j<3;j++) {
              if(prevIndex!=j && min>costs[i][j]) {
                  min = costs[i][j];
                  prevIndex = j;
              }
          }
          System.out.println(min);
          minCost+=min;
      }
      return minCost;
  }
   public static void main(String args[]) {
      int[][] costs = {{5,8,6},{19,14,13},{7,5,12},{14,15,17},{3,20,10}};
      MinCost m = new MinCost();
      System.out.println(m.minCost(costs));
   }
}
