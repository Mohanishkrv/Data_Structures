/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stacks;

import java.util.Scanner;

/**
 *
 * @author Mohanish
 */
public class Stack1_Arr {
    static int max=100;
    static int top;
    static int arr[]=new int[max];//Static so that all methods can access it
    
    //calling constructor to intialise top as -1
    Stack1_Arr()
    {
        top=-1;
    }
   
    boolean push(int x)
    {
        if(top>=max-1)
        {
            System.out.println("Stack Overflow");
            return false;
        }
        else
        {
            arr[++top]=x;
            System.out.println(x+"has been pushed into Stack");
            return true;
        }
    }
    
    boolean pop()
     {
         if(top<0)
         {
             System.out.println("Stack Underflow");
             return false;
         }
         else
         {
             int  x=arr[top--];
             return true;
         }
     }
     
     void tos()
     {
         if(top<0)
         {
             System.out.println("Stack Underflow");
         }
         else
         {
             int x=arr[top];
         }
     }
     
    public static void main(String[] args)
    {
        Stack1_Arr stk=new Stack1_Arr();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
        System.out.println("1.Push 2.Pop 3.TOS 4.print stack 5.exit");
        int s=sc.nextInt();
        if(s==1)
        {
            System.out.println("Enter element to push into stack");
            int a=sc.nextInt();
            stk.push(a);
        }
        if(s==2)
        {
           System.out.println("element is popped from stack");
            stk.pop(); 
        }
        if(s==3)
        {
            try{
            System.out.println("Tos is"+arr[top]);
            }catch(Exception e)
            {
                System.out.println(e);
            }
        }
        
        if(s==4)
        {
            for(int i=0;i<max;i++)
            {
                System.out.println(arr[i]+"  ");
            }
        }
        
        if(s==5)
        {
            break;
        }
        }   
    }
}
/*in this program unused arrays are also shown with  value=0;
fix this
aPPROACHES TAKEN
1.try using system.gc();
                if((arr[i]==0)&&(arr[i+1]==0)&&(arr[i-1]==0))
                {
                    System.gc();
                }
2.USING Delete array operation
*/
got an exceptionn here