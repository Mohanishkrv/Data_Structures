/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queues;

import java.util.Stack;

/**
 *
 * @author Mohanish
 */
public class Queuestk {
    public static void main(String[] args)
    {
        Stack stk1=new Stack();
        Stack stk2=new Stack();
        enqueue(stk1,stk2,12);
        disp(stk1,stk2);
        enqueue(stk1,stk2,142);
        disp(stk1,stk2);
        enqueue(stk1,stk2,111);
        enqueue(stk1,stk2,121);
        disp(stk1,stk2);
        dequeue(stk1,stk2);
        disp(stk1,stk2);
        
    }
    
    public static void enqueue(Stack stk1,Stack stk2,int data)
    {
        while(!stk1.empty())//While stack1 is not empty, push everything from stack1 to stack2.
        {
            stk2.push(stk1.pop());
        }
        stk1.push(data);//Push x to stack1 (assuming size of stacks is unlimited).
        while(!stk2.empty())
        {
            stk1.push(stk2.pop());//Push everything back to stack1.
        }
    }
    
    public static void dequeue(Stack stk1,Stack stk2)
    {
        //If stack1 is empty then error
        //Pop an item from stack1 and return it
        if(stk1.empty())
        {
            System.out.println("Queue is empty");
        }
        else
        {
            stk1.pop();
            return;
        }
    }
    
    public static void disp(Stack stk1,Stack stk2)
    {
        System.out.println("Queue "+stk1);
    }
}
