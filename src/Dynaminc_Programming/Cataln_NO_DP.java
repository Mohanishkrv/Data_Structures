/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dynaminc_Programming;

import java.util.Scanner;

/**
 *
 * @author Mohanish
 */
public class Cataln_NO_DP {
//BY GREEDY APPROACH
/*  

    private static int cataln(int n) 
    {
        int res=0;
        if(n<=1)
        {
            return 1;
        }
        for(int i=0;i<n;i++)
        {
            res+=cataln(i)*cataln(n-i-1);
        }
        return res;
    }
*/
    //BY DP APPROACH
    static int cataln(int n)
    {
        int[] cat=new int[n+2];
        cat[0]=1;
        cat[1]=1;
        for(int i=2;i<=n;i++)
        {
            cat[i]=0;
            for(int j=0;j<i;j++)
            {
                cat[i]+=cat[j]*cat[i-j-1];
            }
        }
        return cat[n];  
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print(cataln(i)+"  ");
        }
    }
}


