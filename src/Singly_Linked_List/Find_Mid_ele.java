/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singly_Linked_List;

import java.io.*;
import java.util.LinkedList;
/**
 *
 * @author Mohanish
 */
/*
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String s=br.readLine();
        String s11[]=s.split(" ");
        LinkedList<Integer> l=new LinkedList<Integer>();
        for(int i=0;i<n;i++)
        {
            l.add(Integer.parseInt(s11[i]));
        }
        System.out.print(l.get(n/2));       
    }  */  
public class Find_Mid_ele {

    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    Node head=null;
    public void aNode(int data)
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
    }
    ///Method1
    //Traverse the whole LL and count no of nodes then traverse again to n/2
    //Complexit{O(n)+O(n/2)}
    private void m1_disp(int pos)
    {
        Node temp=head;
        for(int i=0;i<pos;i++)
        {
            temp=temp.next;
        }
        System.out.print(temp.data);
    }
    //Method 2
    //Traverse linked list using two pointers.
    //Move one pointer by one and other pointer by two.
    //When the fast pointer reaches end slow pointer will reach middle of the linked list.
    public void  m2_disp()
    {
        Node curr=head;
        Node curr2=head;
        while(curr2.next!=null)
        {
            curr=curr.next;
            curr2=curr2.next.next;
        }
        System.out.println("Mid Element by M2 is"+curr.data);
    }
    //Method 3
    //Initialize mid element as head and initialize a counter as 0. 
    //Traverse the list from head, while traversing increment the counter and
    //change mid to mid->next whenever the counter is odd.
    //So the mid will move only half of the total length of the list.
    public void m3_disp()
    {
        Node mid=head;
        int count=0;
        while(mid.next!=null)
        {
            mid=mid.next.next;
            count++;
        }
        Node curr=head;
        while(count-->0)
        {
            curr=curr.next;
        }
        System.out.println("Middle Element by M3 is"+curr.data);
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String s[]=br.readLine().split(" ");
        Find_Mid_ele l=new Find_Mid_ele();
        for(int i=0;i<n;i++)
        {
            l.aNode(Integer.parseInt(s[i]));
        }
        l.m1_disp(n/2);
        System.out.println();
        l.m2_disp();
        l.m3_disp();
    }
}
