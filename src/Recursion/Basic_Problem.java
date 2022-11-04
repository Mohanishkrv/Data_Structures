/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *Given an unsorted array of N elements and an element X.
 * The task is to write a recursive function to check whether
 * the element X is present in the given array or not. 
 * @author ASUS
 */
public class Basic_Problem {
   public static void main(String[] args)
   {
       int a[]={1,2,3,4,5,6,7};
       System.out.println(rec(0,a));
   }
   
   public static boolean rec(int i,int a[])
   {
       if(a[i]==5)
       {
           return true;
       }
       return rec(i+1,a);
   }
}
