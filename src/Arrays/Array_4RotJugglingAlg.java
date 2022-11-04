/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author Mohanish
 */
public class Array_4RotJugglingAlg {
    public static void main(String[] args) 
    { 
        Array_4RotJugglingAlg o = new Array_4RotJugglingAlg();
        Scanner  sc=new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int size=sc.nextInt();
        System.out.println("Enter Array");
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter no. of Rotations");
        int d=sc.nextInt();
        o.rotateLeft(arr,d,size); 
        o.output(arr,size); 
    }

    private void rotateLeft(int[] arr, int d, int size)
    {
         int i, j, m;
         int temp; 
         int g_c_d= HCF(d,size);    // method call to calculate HCF of d and n
// HCF is same as GCD
        for (i=0;i<g_c_d;i++)
        { 
            temp=arr[i]; 
            j=i; 
            while(true)
            { 
                m=j+d; 
                if(m>=size) 
                    m=m-size; 
                if (m==i) 
                    break; 
                arr[j]=arr[m]; 
                j=m; 
            } 
            arr[j]=temp;   //To change body of generated methods, choose Tools | Templates.
     
    }
    
}

    private int HCF(int d, int size)
    {
       if (size == 0)
            return d; 
        else
            return HCF(size,d%size);
    }
//To change body of generated methods, choose Tools | Templates.

     void output(int arr[],int size) 
    {
        int i;
        for(i=0;i<size;i++)
        { 
            System.out.print(arr[i] + " "); 
        }
    }    
}
