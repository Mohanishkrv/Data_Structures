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
public class InfixtoPostfix {
    public static void main(String[] args)
    {
        String exp="(A+B/C*(D+E)-F)";
        eva(exp);
        try
        {
        eva(exp);
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public static void eva(String e)
    {
        Stack opr=new Stack();
        Stack opd=new Stack();
        
        for(int i=0;i<e.length();i++)
        {
            char c=e.charAt(i);
            if(Character.isAlphabetic(c))
            {
                opd.push(c);
                //System.out.println("Postfix"+ opd+"  ");
            }
            if(c=='(')
            {
                opr.push(c);
            }
            if(c==')')
            {
                char d;
                while(true)
                {
                    d=(char) opr.pop();
                    if(d=='(')
                    {
                        opr.pop();
                        break;
                    }
                    else 
                    {
                        opd.push(d);
                    }
                }
            }
            else
            {
                if(opr.isEmpty())
                {
                    opr.push(c);
                }
                else if(!opr.isEmpty())
                {
                    if(prec((char) opr.peek())>=prec(c))
                    {
                        char a=(char) opr.pop();
                        opd.push(a);                            
                    }   
                    
                    else
                    {
                        opr.push(c);
                    }
                }
                
            }
            System.out.println(""+opd);
        }
                
    }
    
    public static int prec(char ch)
    {
        switch(ch)
        {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
                
        }
        return 0;
    }
    
}

#this program is wrong