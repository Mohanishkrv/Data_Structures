/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Expreesions;

import java.util.Stack;

/**
 *
 * @author Mohanish
 */
public class Prefix_Eva {
    public static void main(String[] args)
    {
        String exp="+9*26";
        try{
        System.out.println(eva(exp));
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static double eva(String e)
    {
        Stack stk=new Stack();
        for(int i=e.length()-1;i>=0;i--)
        {
            char c=e.charAt(i);
            if(Character.isDigit(c))
            {
                System.out.println("  "+c);
                //-48 becaus ascii values have been coming
                stk.push((double)c-48);
            }
            else
            {
                double o1 = (double) stk.peek(); 
                stk.pop(); 
                double o2 = (double) stk.peek(); 
                stk.pop(); 
  
                // Use switch case to operate on o1 
                // and o2 and perform o1 O o2. 
                switch (e.charAt(i)) { 
                case '+': 
                    stk.push(o1 + o2); 
                    break; 
                case '-': 
                    stk.push(o1 - o2); 
                    break; 
                case '*': 
                    stk.push(o1 * o2); 
                    break; 
                case '/': 
                    stk.push(o1 / o2); 
                    break; 
            }
            
        }
        
        
    }
        return (double) stk.peek();
 }
}