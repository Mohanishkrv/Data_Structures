/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author ASUS
 */
public class Array6_Insertion {
    public static void main(String[] args)
    {
        int a[]={1,2,3,4,5,6,7,8,10};
        int x=9;
        int pos=9;
        int n=a.length;
        int newarr[]=insertion(a,x,pos,n);
        for(int i=0;i<newarr.length;i++)
        {
            System.out.print(newarr[i]+" ");
        }
    }

    private static int[] insertion(int[] arr, int x,int pos,int n) 
    {int i; 
  
        // create a new array of size n+1 
        int newarr[] = new int[n + 1]; 
        // insert the elements from 
        // the old array into the new array 
        // insert all elements till pos 
        // then insert x at pos 
        // then insert rest of the elements 
        for (i = 0; i < n + 1; i++) 
        { 
            if (i < pos - 1) 
                newarr[i] = arr[i]; 
            else if (i == pos - 1) 
                newarr[i] = x; 
            else
                newarr[i] = arr[i - 1]; 
        } 
        return newarr; 
    }
}
