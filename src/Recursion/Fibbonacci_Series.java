/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author ASUS
 */
public class Fibbonacci_Series {
    public static void main(String[] args)
    {
        int n=10;
        System.out.print(recfib(n));
    }
    
    public static int recfib(int n)
    {
        if(n==1 || n==2)
        {
            return n;
        }
        else
        {
            return recfib(n-1)+recfib(n-2);
        }
    }
}
