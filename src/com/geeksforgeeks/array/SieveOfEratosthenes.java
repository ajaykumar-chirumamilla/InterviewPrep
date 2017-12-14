package com.geeksforgeeks.array;

public class SieveOfEratosthenes {
   public void getAllPrimeNumbers(int n) {
      boolean[] prime = new boolean[n+1];
      for(int i=0;i<=n;i++) {
         prime[i] = true;
      }
      
      for(int i=2;i*i<=n;i++) {
         if(prime[i] == true) {
            for(int j = i;j<=n;j+=i) {
               prime[j] = false;
            }
         }
      }
      
      for(int i=0;i<=n;i++) {
         if(prime[i])
            System.out.println(i);
      }
   }
   
   public static void main(String args[]) {
      SieveOfEratosthenes s= new SieveOfEratosthenes();
      s.getAllPrimeNumbers(54);
   }
}
