        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

import static java.lang.Thread.State.values;
import java.util.Scanner;

/**
 *
 * @author Mohanish
 */
public class BubbleSort {
    void sort(int a[])
    {
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp;
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        print(a);
    }
    
    void print(int a[])
    {
        System.out.println("Sorted Array is");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        String[] sa=st.split(" ");
        int[] a=new int[sa.length];
        for (int i = 0; i <sa.length; i++)
        {
            a[i] =Integer.parseInt(sa[i]);
        }
       
          /*Scanner sc=new Scanner(System.in);  //initialize scanner
          int[] a = new int[6]; //initialize array 
          for (int i = 0; i < a.length; i++) 
          {
                a[i] = (sc.hasNext()==true?sc.nextInt():null);
          } */  

         
        BubbleSort bs=new BubbleSort();
        bs.sort(a);
}
}
