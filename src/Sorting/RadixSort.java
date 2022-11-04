/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Mohanish
 */
public class RadixSort {
    
    
    public static int max(int a[])
    {
        int mx=a[0];
        for(int i=0;i<a.length;i++)
        {
           if(a[i]>mx)
           {
               mx=a[i];
           }
        }
        return mx;
    }
    
    static void countSort(int arr[], int n, int exp) 
    { 
        int output[] = new int[n]; // output array 
        int i; 
        int count[] = new int[10]; 
        Arrays.fill(count,0); 
  
        // Store count of occurrences in count[] 
        for (i = 0; i < n; i++) 
            count[ (arr[i]/exp)%10 ]++; 
  
        // Change count[i] so that count[i] now contains 
        // actual position of this digit in output[] 
        for (i = 1; i < 10; i++) 
            count[i] += count[i - 1]; 
  
        // Build the output array 
        for (i = n - 1; i >= 0; i--) 
        { 
            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i]; 
            count[ (arr[i]/exp)%10 ]--; 
        } 
  
        // Copy the output array to arr[], so that arr[] now 
        // contains sorted numbers according to curent digit 
        for (i = 0; i < n; i++) 
            arr[i] = output[i]; 
    } 
  
    public static void sort(int a[])
    {
        int m=max(a);
        for(int i=1;(m/i)>0;i*=10)
        {
            countSort(a,a.length,i);
        }
    }
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[7];
        for(int i=0;i<a.length;i++)
        {
            a[i]=(sc.hasNext()==true?sc.nextInt():null);
        }
        sort(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
}
