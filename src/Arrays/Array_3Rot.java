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
public class Array_3Rot {
    Scanner sc=new Scanner(System.in); //making object as global so that all methods can access it
    public static void main(String[] args)
    {
           
        int arr[]=new int[5];
        Array_3Rot a=new Array_3Rot();
        a.Input(arr);
        a.rotation(arr);
        //a.Output(arr);
    }
    
    public void Input(int arr[])
    {
System.out.println("Enter Array");
for(int i=0;i<5;i++)
{
    arr[i]=sc.nextInt();
}
    }
    //By Using temp Variable
    public void rotation(int arr[])
    {
        System.out.println("Enter no. of Rotations");
        int n=sc.nextInt();
        int temp;
        for(int i=0;i<n;i++)
        {
            temp = arr[0];
            for(int j=0;j<arr.length-1;j++)
            {
                arr[j]=arr[j+1];
                arr[j]=temp;
            }
            
        }
        Output(arr);
    }
    
    public void Output(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(+arr[i]);
        }
    }
}
this prog is wrong
correct it
