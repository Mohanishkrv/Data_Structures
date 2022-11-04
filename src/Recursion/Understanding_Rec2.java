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
public class Understanding_Rec2 {
    
    public static int rec(int x)
    {
        if(x<5)
        {
            System.out.println("-->Smaller than 5");
            rec(x+1);
            System.out.println("<--After recursion inside x<5");
            return x;
        }
        else if(x<7)
        {
            System.out.println("-->Smaller than 7");
            rec(x+1);
            System.out.println("<--After recursion inside x<7");
        }
        System.out.println("<--No Condition Statement");
        return x;
    }
    
    public static void main(String[] args)
    {
        int x=1;
        rec(x);
        System.out.print(x+"Inside main");
    }
}
