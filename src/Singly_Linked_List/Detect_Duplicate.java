/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singly_Linked_List;

/**
 *
 * @author ASUS
 */
public class Detect_Duplicate {
class Node
{
    int data;
    Node next;
    Node(int item)
    {
       data=item; 
    }
}
Node head=null;

public  void add(int data)
{
    Node n=new Node(data);
    if(head==null)
    {
        head=n;
        return;
    }
    n.next=null;
    Node curr=head;
    while(curr.next!=null)
    {
        curr=curr.next;
    }
    curr.next=n;
 }
public void  disp()
{
    Node curr=head;
    while(curr!=null)
    {
        System.out.print(curr.data+" ");
        curr=curr.next;
    }
}
//Method 1 
//This method is completed in worst case in O(n^2)
public String detect_dup()
{
    Node curr=head;
    while(curr.next!=null)
    {
        Node curr2=head;
        while(curr2.next!=null)
        {
            if(curr.data==curr2.data)
            {
                return "Found";
            }
        }
    }
    return "Not Found";
}
//Method 2
//It also removes the duplicate item

public  Node rec_detect_dup(Node head)
{
    Node to_free;    
    if(head==null)
    {
        return null;
    }
    if(head.next!=null)
    {
        if(head.data==head.next.data)
        {
            to_free=head.next;
            head.next=head.next.next;
            rec_detect_dup(head);
        }
        else
        {
            rec_detect_dup(head.next);
        }
    }
    return head;
}

public static void main(String[] args)
{
    Detect_Duplicate l=new Detect_Duplicate();
    l.add(1);
    l.add(2);
    l.add(3);
    l.add(3);
    l.add(4);
    l.disp();
    //l.rec_detect_dup(head);
    l.disp();
    
    System.out.print("Duplicate "+l.detect_dup());
}
}
