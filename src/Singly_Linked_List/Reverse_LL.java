/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singly_Linked_List;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author ASUS
 */
public class Reverse_LL {   
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    
    public void add_node(int data)//Adding node at last
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
    
    public void disp()
    {
        Node curr=head;
        if(head==null)
        {
            System.out.print("Empty LL");
            return;
        }
        System.out.println("Traversing:");
        System.out.print("[");
        while(curr!=null)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println("]");
    }
    
    public void reverse()
    {
        head=r_disp(head);
        disp();
    }
    
    public void rec_rev()
    {
        
    }
    
    public Node r_disp(Node node)
    {
        Node curr=head;//
        Node prev=null;
        Node next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }       
        node=prev;
        return node;
    }
    
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String s[]=br.readLine().split(" ");
        Reverse_LL l=new Reverse_LL();
        for(int i=0;i<n;i++)
        {
            int a=Integer.parseInt(s[i]);
            l.add_node(a);
        }
        l.disp();
        l.reverse();
    }
}
