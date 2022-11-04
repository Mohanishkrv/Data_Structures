/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author Mohanish
 */
public class CLL {
    static class Node
    {
        int data;
        Node next;
    }
    static Node add(Node hr,int data)
    {
        Node n=new Node();
        Node temp=hr;
        n.data=data;
        n.next=hr;
        if(hr!=null)
        {
            while(temp.next!=hr)
            {
                temp=temp.next;
            }
            temp.next=hr;
        }
        else
        {
            n.next=n;
        }
        hr=n;
        return hr;
    }
    
    static void disp(Node head)
    {
        Node temp=head;
        if(head!=null)
        {
            do
        { 
            System.out.print(temp.data + " "); 
            temp = temp.next; 
        } 
        while (temp != head);
        }
    }
    
    public static void main(String[] args)
    {
        Node head=null;
        head=add(head,12);
        head=add(head,13);
        head=add(head,122);
        head=add(head,15);
        disp(head);
    }
    
}
