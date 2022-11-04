/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Arrays;

/**
 *
 * @author ASUS
 */
public class Array_All_Operations {
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
    
    Operations o=new Operations();
    //o.printt(arr);
    //o.insrtAtPos(arr,3,88);
    o.del(arr,5);
    }
}
class Operations
{
    public static void insrtAtPos(int[] arr,int pos,int val)
    {
        int narr[]=new int[arr.length+1];
        for(int i=0;i<pos;i++)
        {
            narr[i]=arr[i];
        }
        narr[pos]=val;
        for(int i=pos+1;i<narr.length;i++)
        {
            narr[i]=arr[i-1];
        }
        printt(narr);
    }
    public static void printt(int [] arr)
    {
        System.out.println(Arrays.toString(arr));
    }
    public static void del(int[] arr,int val)
    {
        int narr[]=new int[arr.length-1];
        int i=0;
        while(arr[i]!=val)
        {
            narr[i]=arr[i];
            i++;
        }
        for(int j=i+1;j<narr.length;j++)
        {
            narr[i]=arr[i+1];
        }
        printt(narr);
    }
}
