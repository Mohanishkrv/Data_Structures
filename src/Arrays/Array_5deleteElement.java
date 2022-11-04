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
public class Array_5deleteElement {
    public static void main(String[] args)
    {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        System.out.print(Arrays.toString(delete(a,3)));
    }

    private static int[] delete(int[] a, int index) 
    {
        int temp=0;
        int b[]=new int[a.length-1];
        for(int i=0;i<b.length;i++)
        {
            if(i+1==index)
            {
                continue;
            }
            else
            {
                b[temp++]=a[i];
            }
        }
        return b;
    }
}
