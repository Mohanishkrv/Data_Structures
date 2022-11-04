/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author ASUS
 */
public class Teranay_Search {
public static void main(String[] args) throws Exception
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n=Integer.parseInt(br.readLine());
    String s[]=br.readLine().split(" ");
    int a[]=new int[n];
    for(int i=0;i<a.length;i++)
    {
        a[i]=Integer.parseInt(s[i]);
    }
    Arrays.sort(a);
    int x=Integer.parseInt(br.readLine());
    int f=ternary_search(a,x);
    if(f==-1)
    {
        System.out.print("Not Found");
    }
    else
    {
        System.out.print(a[f]+" found at location "+(f+1));
    }
}

    private static int ternary_search(int[] a, int x) 
    {
        int l=0,h=a.length-1;
        while(l<=h)
        {
            int m1=l+((h-l)/3);
            int m2=h-((h-l)/3);
            if(a[m1]==x)
            {
                return m1;
            }
            else if(a[m2]==x)
            {
                return m2;
            }
            else if(a[m1]<x)
            {
                h=m1-1;
            }
            else if(a[m2]>x)
            {
                l=m2+1;
            }
            else
            {
                l=m1+1;
                h=m2-1;
            }
        }
        return -1;
    }
}
