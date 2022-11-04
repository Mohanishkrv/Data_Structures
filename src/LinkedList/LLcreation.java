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
public class LLcreation {
    class Node
    {
        int data; //variable to store data
        Node next; //variable to store reference of next node
        
        Node(int data)
        {
            this.data=data;//says Node.data where node is the object of class Node
            this.next=null;//says  Node.next
        }
    }
    Node head=null;   //Representing head and tail
    Node tail=null;    
    
    public void aNode(int data)//method to add node //Addition of note at tail OR Last
    {
        Node n=new Node(data);
        if(head==null) //checks if list is empty
        {              //if list is empty both head and tail will point to new node n
            head=n;
            tail=n;
        }
        else
        {
            tail.next=n; //Newnode n will be added after tail such that tails reference will point to n
            tail=n; //newnode n will become new tail
        }
    }
    
    public void afNode(int data) //method to add node at the front of any linked list
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
            tail=n;
        }
        else
        {
            n.next=head; //assign the new node as head pointing towards previous head
            head=n; //Assign value to the new head
        }
    }
    
    public void aaNode(Node prev,int data) //method to add node after a given node
    {
        Node n=new Node(data);
        if(prev==null)
        {
            System.out.println("Cannot be inserted");
            return;
        }
        
        n.next=prev.next;
        prev.next=n;
        
    }
    
    public void dNode(int key) //method to delete a node
    {
        Node temp=head,prev=null;//Store head node to temp
        if(temp!=null && temp.data==key)//if head itself holds the key to be deleted
        {
            head=temp.next;
            return;
        }
        // Search for the key to be deleted, keep track of the 
        // previous node as we need to change temp.next
        while(temp!=null && temp.data!=key)
        {
            prev=temp;
            temp=temp.next;
        }
        if(temp==null)//Key is not present
        {
            System.out.println("Key is not Present");
            return;
        }
        prev.next=temp.next;
    }
    
    public void dpnode(int pos)//deleting a node at a given position
    {
        Node temp=head;//store head node
        if(head==null)
        {
            System.out.println("LL is empty");
            return;
        }
        //if head needs to be removed   
        if(pos==0)
        {
            head=temp.next;//Change head node to temporary
            return;
        }
        //Finding previous node of the NOde to be Deleted
        for(int i=0;temp!=null && i<pos-1;i++)
        {
            temp=temp.next;
        }
        //if Position>No. of Nodes
        if(temp==null || temp.next==null)
        {
            return;
        }
        // Node temp->next is the node to be deleted 
        // Store pointer to the next of node to be deleted
        Node next=temp.next.next;
        temp.next=next; // Unlink the deleted node from list
    }
    public void disp()
    {
        Node curr=head;
        if(head == null)
        {    
            System.out.println("List is empty");    
            return;  
        }
        while(curr!=null)
        {
            System.out.println(curr.data+"");
            curr=curr.next;
        }
    }
    
    
    
    public static void main(String[] args)
    {
        LLcreation l=new LLcreation();
        l.aNode(1);
        l.aNode(2);
        l.aNode(3);
        l.aNode(4);
        l.aNode(5);
        l.aNode(6);
        l.disp();
        l.dNode(3);
        l.disp();
        l.afNode(12);
        l.disp();
        l.aaNode(l.head.next.next.next,13);//Argument is not type of int beacuse it is of Node type
        l.disp();
    }
    
}
