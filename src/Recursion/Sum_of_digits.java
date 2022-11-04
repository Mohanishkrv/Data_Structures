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
public class Sum_of_digits {
    public static void main(String[] args)
    {
        int n=12345;
        System.out.print(rec(n));
    }
    
    public static int rec(int n)
    {
        if(n<10)
        {
            return n;
        }
        else
        {
            return n%10 + rec(n/10);
        }
    }
}
