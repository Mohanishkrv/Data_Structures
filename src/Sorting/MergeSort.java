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
public class MergeSort {
    
    void merge(int a[],int l,int m,int h)
    {
        int n1=m-l+1;
        int n2=h-m;
        int L[] = new int [n1];
        int R[] = new int [n2];
        for (int i=0; i<n1; ++i)
        {
            L[i] = a[l+i];
        }
        for(int j=0;j<n2;++j)
        {    
            R[j]=a[m+1+j];
        }
        int i=0,j=0;
        int k=l;
        while (i<n1 && j<n2)
        {
            if(L[i]<=R[j])
            {
                a[k]=L[i];
                i++;
            }
           else
            {
                a[k]=R[j];
                j++;
            }
            k++;
        }
        while (i<n1)
        {
            a[k]=L[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            a[k]=R[j];
            j++;
            k++;
        }
    }
    
    void sort(int a[],int l,int h)
    {
        int m=(l+h)/2;
        if(l<h)
        {
            sort(a,l,m);
            sort(a,m+1,h);
            merge(a,l,m,h);
        }
    }
    
   public void print(int a[])
   {
       for(int i=0;i<a.length;i++)
       {
           System.out.print(a[i]+" ");
       }
   }
    
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    String st=sc.nextLine();
    String sa[]=st.split(" ");
    int a[]=new int[sa.length   ];
    for(int i=0;i<a.length;i++)
    {
        a[i]=Integer.parseInt(sa[i]);
    }
    MergeSort ms=new MergeSort();
    ms.sort(a,0,a.length-1);
    ms.print(a);
}
}
