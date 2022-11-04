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
public class Understanding_Rec {
 
    public static int recur(int i, int nesting)
    {
        int c;
        for(c=0;c<nesting;c++) 
        { 
            System.out.print(" ");
        }
        System.out.println("recur"+nesting+" "+i);
        if (i < 3)
        {
            System.out.println("i <3, calling recur"+(nesting+1)+" "+(i+1));
            recur(i + 1, nesting+1);
            for(c=0;c<nesting;c++) 
            {
                System.out.printf(" ");
            }
            System.out.println("returning 10 from recur"+nesting+"with i=="+i);
            return 10;
        }
    else if (i < 5)
    {
        int j=0;
        System.out.println("i <5, calling recur"+(nesting+1)+" "+(i +1));
        j=recur(i + 1, nesting+1);
        for(c=0;c<nesting;c++) 
        {
            System.out.printf(" ");
        }
        System.out.println("ignored return value from recur"+(nesting+1)+" "+(i+1)+"is"+j);
    }
    System.out.println();
    for(c=0;c<nesting;c++) 
    {
        System.out.printf(" ");
    }
    System.out.println("returning i from recur"+nesting+"with i=="+i);
    return i;
}

    public static void main(String[] args)
    {
        int i=0;
        i = recur(i, 0);
        System.out.printf("the last return value did not get ignored: i = "+i);
    }   
}
