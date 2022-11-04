/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dynaminc_Programming;

import java.util.Scanner;

/**
 *Ugly numbers are numbers whose only prime factors are 2, 3 or 5.
 * The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, … shows the first
 * 11 ugly numbers. By convention, 1 is included.

Given a number n, the task is to find n’th Ugly number.
 * 
 * @author Mohanish
 */
public class Ugly_Numbers {
    public static void main(String[] args)
    {
        //By GREEDY ALGORITHM
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int number=getNo(n);
        System.out.print(number);
    }

    private static int getNo(int n) 
    {
        int i=1;
        int c=1;
        while(n>c)
        {
            i++;
            if(ugly(i)==1)
            {
                c++;
            }
        }
        return i;
    }

    private static int ugly(int i) 
    {
        i=divide(i,2);
        i=divide(i,3);
        i=divide(i,5);
        return(i==1)?1:0;
    }

    private static int divide(int i, int j) 
    {
        while(i%j==0)
        {
            i=i/j;
        }
        return i;
    }
    
}
