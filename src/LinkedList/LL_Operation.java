    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author ASUS
 */
public class LL_Operation {
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
    
    public void addatFront(int data)//    - - - head
    {
        //No need for empty ll case bcoz below code solves that problem autommatically
        Node n=new Node(data);
        n.next=head;
        head=n;
    }
    
    public void addatLast(int data)//   head - - -
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
            return;
        }
        n.next=null;
        Node last=head;
        while(last.next!=null)
        {
            last=last.next;
        }
        last.next=n;
    }
    
    public Node addatPos(int data,int index)
    {
        Node n=new Node(data);
        if(index==0 || head==null)
        {
            head=n;
            return head;
        }
        else if(index<1)
        {
            System.out.println("Invalid Position");
        }
        else if(index==1)
        {
            n.next=head;
            head=n;
        }
        else
        {
            Node curr=head;
            while(index--!=0)
            {
                if(index==1)
                {
                    n.next=curr.next;
                    curr.next=n;
                    break;
                }
                curr=curr.next;
            }
        }
        return head;
    }
    
    public void deleteUsingKey(int data)
    {
        if(head==null)
        {
            System.out.print("Empty Linked List");
            return;
        }
        Node curr=head;   
        Node prev=null;
        while(curr.data!=data)
        {
            prev=curr;
            curr=curr.next;
        }
        prev.next=curr.next;
    }
    
    public void deleteatPos(int index)
    {
        if(index<0 || head==null)
        {
            System.out.print("invalid");
            return;
        }
        Node curr=head;
        Node prev=null;
        while(index!=0)
        {
            prev=curr;
            curr=curr.next;
            index--;
        }
        prev.next=curr.next;
    }
    
    public void traverse()
    {
        Node curr=head;
        if(head==null)
        {
            System.out.println("Linked List is Empty");
            return;
        }
        System.out.print("[");
        while(curr!=null)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println("]");
    }
    
    public static void main(String[]  args)
    {
        LL_Operation l=new LL_Operation();
        l.addatLast(22);
        l.addatLast(33);
        l.addatLast(44);
        l.addatFront(00);
        l.traverse();
        l.addatFront(-11);
        l.addatFront(-22);
        l.addatFront(-33);
        l.traverse();
        l.addatPos(11,4);//Indexing starts from 1
        l.traverse();
        //l.deleteUsingKey(1);
        l.traverse();
        //l.deleteatPos(1);
        l.traverse();
    }
}
