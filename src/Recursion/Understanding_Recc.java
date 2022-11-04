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
public class Understanding_Recc {
    public static void main(String[] args)
    {
        int x=1;
        System.out.println("Before Recursion");
        rec(x);
        System.out.println("After Recursion");   
    }
    
    public static void rec(int x)
    {
        if(x<=10)
        {
            System.out.println("Before fucntion call :"+x);
            rec(x+1);
            //x-=3;
            System.out.println("After fucntion call :"+x);
            /*if(x<5);
            {
                System.out.println("X is < 5");
                return;
            }*/
        }
        else
        {
            System.out.println("Reached 10");
        }
    }
}