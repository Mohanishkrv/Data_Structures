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
public class Postfix_Eva {
    public static void main(String[] args)
    {
        String exp="231*+9-";
        System.out.println(eva(exp));
    }
    
    static int eva(String e)
    {
        Stack stk=new Stack();
        for(int i=0;i<e.length();i++)
        {
            char c=e.charAt(i);
            if(Character.isDigit(c))
            {
                //Casting is not done
                stk.push(c-'0');
                
            }
            else
            {
                int a=(int) stk.pop();
                int b=(int) stk.pop();
                switch(c)
                {
                    case '+': 
                    stk.push(a+b); 
                    break; 
                      
                    case '-': 
                    stk.push(a-b); 
                    break; 
                      
                    case '/': 
                    stk.push(a/b); 
                    break; 
                      
                    case '*': 
                    stk.push(a*b); 
                    break; 
                }
            }
        }
        return (int) stk.pop();
    }
}
