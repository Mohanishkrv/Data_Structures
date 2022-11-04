/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Expreesions;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Mohanish
 */
public class infix_eva {
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        infix_eva o1=new infix_eva();
        Stack opd=new Stack();
        Stack opr=new Stack();
        System.out.println("Enter String");
        String s=sc.nextLine();       
        evaluate(opd,opr,s);
        last(opd,opr,s);
    }
    
    //Method to differentiate between Alphanumeric and operators
    static public void evaluate(Stack opd,Stack opr,String s)
    {
        for(int i=0;i<s.length();i++)
        {
            //defining a variable to us method charAt(index)
            char c=s.charAt(i);
            //case 1:For Operands
        /*    if(Character.isDigit(c))
            {
                opd.push(c);
            }
            else */if(Character.isAlphabetic(c))
            {
                opd.push(c);
            }
            //Case 2: For }
            else if(c==')')
            {
                while(c=='(')
                {
                    int a=process(opd,opr,s);///?????????????????????????
                    opr.pop();
                }
            }
            //Case 3: For )
            else if(c=='(')
            {
                opr.push(c);
            }
            //Case 4: For Operators
            else
            {
 
                if(opr.isEmpty())
                {
                    opr.push(c);
                }
                else
                {
                  while(prec(c)>=prec((char) opr.peek())) //casted TOS/peek to character so that bot become of same type
                  {
                      opr.push(c);
                  }
                  while(prec(c)<prec((char)opr.peek()))
                  {
                      process(opd,opr,s);//process methood is called until below condition is satisfied
                      if(prec(c)>prec((char)opr.peek()))
                      {
                          break;
                      }
                  }
                }
            }
        }
        System.out.println("opd"+opd);
        System.out.println("opr"+opr);
        
    }
    
   //Function
    static public void last(Stack opd,Stack opr,String s)
    {
        if(!opr.isEmpty())
        {
            process(opd,opr,s);
        }
        else
        {
            System.out.println(" Result is "+opd);
        }
    }
    //Method to create precendence table type
    static public int prec(char c)
    {
        switch(c)
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
        return -1;
    }
    
    //Method for the most used operations
    static public int process(Stack opd,Stack opr,String s)
    { 
        //casting the popped values so that operations can be performed
       char a=(char) opd.pop();
       char b=(char) opd.pop();
       char c=(char) opr.pop();          
        switch(c)
        {
            case'+':
                return a+b;
            case'-':
                return a-b;
            case'^':
                return a^b;
            case'/':
                return a/b;
            case'*':
                return a*b;
        }
        return 0;
    } 
}

