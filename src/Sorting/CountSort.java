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
public class CountSort {
    public static void sort(int a[])
    {
        int o[]=new int[a.length];
        int count[]=new int[256];
        for(int i=0;i<256;++i)
        {
            count[i]=0;
        }
        for(int i=0;i<a.length;++i)
        {
            ++count[a[i]];
        }
        for(int i=1;i<=255;++i)
        {
            count[i]+=count[i-1];
        }
        for(int i=a.length-1;i>=0;i--)
        {
            o[count[a[i]]-1]=a[i];
            --count[a[i]];
        }
        for(int i=0;i<a.length;++i)
        {
            a[i]=o[i];
        }
        
        
    }
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[7];
        for(int i=0;i<7;i++)
        {
            a[i]=(sc.hasNext()==true?sc.nextInt():null);
        }
        sort(a);
        for(int j=0;j<a.length;j++)
        {
            System.out.print(a[j]+" ");
        }
    }
    
}
