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
public class Fibonacci_Series {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f[]=new int[n+2];//Extra space for handling case n=0
        int i;
        f[0]=0;//assining values to 0 and 1st no on the series
        f[1]=1;
        for(i=2;i<=n;i++)
        {
            //Add the previous 2 no on the series and store it
            f[i]=f[i-1]+f[i-2];
        }
        System.out.print(f[n]);
    }
}
