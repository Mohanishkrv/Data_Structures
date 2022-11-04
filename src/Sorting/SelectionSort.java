/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

import java.util.Scanner;

/**
 *
 * @author Mohanish
 */
public class SelectionSort 
{
    
 public void sort(int a[])
 {
     for(int i=0;i<a.length-1;i++)
     {
         int min=i;
         for(int j=i+1;j<a.length;j++)
         {
             if(a[j]<a[min])
             {
                 min=j;
             }
         }
         int temp=a[min];
         a[min]=a[i];
         a[i]=temp;
     }
     print(a);
 }
 
 public void print(int a[])
 {
     System.out.println("After Sorting");
     for(int i=0;i<a.length;i++)
     {
         System.out.print(a[i]+" ");
     }
 }
 
 public static void main(String[] args)
 {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter No.s");
     int a[]=new int[5];
     for(int i=0;i<a.length;i++)
     {
         a[i]=(sc.hasNext()==true?sc.nextInt():null);
     }
     SelectionSort ss=new SelectionSort();
     ss.sort(a);
 }
}
