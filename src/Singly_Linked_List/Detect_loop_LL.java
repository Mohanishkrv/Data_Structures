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
public class Detect_loop_LL 
{
    class Node
    {
        int data;
        Node next;
        int flag;//For detection of loop
        Node(int item)
        {
            data=item;
            this.next=null;
        }

    }
    Node head=null;
    
    public Node newNode(int data)
    {
        Node temp=new Node(data);
        temp.data=data;
        temp.next=null;
        return temp;
        
    }
    
    /*public void add(int data)
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
            return;
        }
        Node curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=n;
        n.next=null;        
    }*/
    
    
    public void disp(Node head  )  
    {
        if(head==null)
        {
            System.out.print("Empty LL");
            return;
        }
        Node curr=head;
        System.out.print("[");
        while(curr!=null)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.print("]");
    }
    
    public boolean loop()
    {
        Node curr =head;
        while(curr!=null)
        {
            if(curr.flag==1)
            {
                return true;
            }
            curr.flag=1;
        }
        return false;
    }
    
    
    public static void main(String[] args)
    {
        Detect_loop_LL l=new Detect_loop_LL();
        Node head = l.newNode(1); 
        head.next = l.newNode(2); 
        head.next.next = l.newNode(3); 
        head.next.next.next = l.newNode(4); 
        head.next.next.next.next = l.newNode(5); 
        
        head.next.next.next.next.next = head.next.next;
        //l.disp(head);
        if(l.loop())
        {
            System.out.print("Not Found");
        }
        else
        {
            System.out.print("Found");
        }
    }
}
