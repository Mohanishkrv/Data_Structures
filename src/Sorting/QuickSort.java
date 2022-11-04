/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author Mohanish
 */
public class QuickSort {
    
    static void qsort(int a[],int low,int high)
    {
        if(low<high)
        {
            int pi=partition(a,low,high);
            qsort(a,low,pi-1);
            qsort(a,pi+1,high);
        }
    }
    
    static int partition(int a[],int low,int high)  
    {
        int pivot=a[high];
        int i=low-1;
        for(int j=low;j<high;j++)
        {
            if(a[j]<pivot)
            {
                i++;
                swap(a,i,j);
            }
        }
        swap(a,i+1,high);
        return i+1;
    }
    
    static void print(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args)
    {
       int a[]={4112,213,4,4,11,44,1};
        qsort(a,0,a.length-1);
        print(a);
    }

    private static void swap(int[] a, int i, int j) 
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    
}
