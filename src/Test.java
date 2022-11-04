/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Test {
    public static void main(String[] args)
    {
        System.out.print(rec(5));
    }

    private static int rec(int n) 
    {
        if(n==0)
        {
            return n;
        }
        return n+rec(n-1);
    }
}
