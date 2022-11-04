/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stacks;

/**
 *
 * @author ASUS
 */
public class Stack2_LL {
    class Node
    {
       int data;
       Node next;
       Node(int x)
       {
           data=x;
       }
    }
    Node top;
    public boolean isEmpty()
    {
        if(top==null)
            return true;
        else
            return false;
    }
    public void push(int data)
    {
        Node n=new Node(data);
        if(top==null)
        {
            top=n;
        }
        else
        {
            n.next=top;
            top=n;
        }
    }
    public int pop()
    {
        int x = Integer.MIN_VALUE;
        Node temp=top;
        if(top==null)
        {
            System.out.println("Empty Stack");
            return -1;
        }
        else
        {
            temp=temp.next;
            x=top.data;
            top=temp;
            return x;
        }
    }
    public int peek()
    {
        if(top==null)
        {
            System.out.println("Empty Stack");
            return Integer.MIN_VALUE;
        }
        else
        {
            return top.data;
        }
    }
    
    
    public static void main(String args[])
    {
        Stack2_LL stk=new Stack2_LL();
        stk.push(1);
        stk.push(2);
        System.out.println(stk.peek());
        System.out.println(stk.pop());
        System.out.println(stk.peek());
        
    }
}
