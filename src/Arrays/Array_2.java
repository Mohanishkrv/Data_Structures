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
public class Array_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr size of array");
        int size=sc.nextInt();
        System.out.println("Enter Elements of array");
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter case");
        System.out.println("1.Insert 2.Delete 3.Search 4.Traverse 5. Update");
        int n=sc.nextInt();
        switch(n)
        {

            case 1:System.out.println("Enter element to be Inserted");
                   int arr2[]=new int[size+1];
                   int ele=sc.nextInt();
                   //System.out.println(ele+"");
                   System.out.println("Enter Location");
                   int loc=sc.nextInt();
                 for(int j=0;j<size+1;j++)
                 {
                     if(j<loc-1)
                     {
                         arr2[j]=arr[j];
                     }
                     else if(j==loc-1)
                     {
                         arr2[loc]=ele;
                     }
                     else
                     {
                         arr2[j]=arr[j-1]; //mistaked here
                     }
                     System.out.println(arr2[j]+"  ");
                 }
                               /*for(int i=0;i<size+1;i++)
                               {
                                   System.out.println(arr2[i]+"  ");
                               }*/
            break;
            
            case 2:System.out.println("Enter the element you want to delete");
            //Wrong
            int e=sc.nextInt();
            int arr3[]=new int[size-1];
            for(int i=0;i<size;i++)
            {
                if(e==arr[i])
                {
                    System.out.println(e +"//loc="+ i);
                    for(int j=0;j<size-1;j++)
                    {
                        if(j<i)
                        {
                            arr3[j]=arr[j];
                        }
                        if(j>i)
                        {
                            arr[j]=arr[i+1];
                        }
                    }
                }
            }
            for(int i=0;i<size-1;i++)
            {
                System.out.println(arr3[i]);
            }
            break;    
            case 4:System.out.println("Displaying Output");
                for(int i=0;i<size;i++)
                {
                    System.out.println(arr[i]+"  ");
                }
            break;
        }
    }
}
