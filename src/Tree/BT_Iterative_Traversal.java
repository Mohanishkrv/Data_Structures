/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Mohanish
 */

//This is Level Order Traersal of Binary tree
//Using Queues
public class BT_Iterative_Traversal 
{
    static class Node
    {
        int data;
        Node left,right;
        public Node(int item)//Constructor
        {
            data=item;
            left=right=null;   
        }
    }
    Node root;
    public void levelorder()
    {
        Queue<Node> queue=new LinkedList<Node>();
        queue.add(root);//using queue's add function
        while(!queue.isEmpty())
        {
            Node temp=queue.poll();
            //Queue.poll return the element at the front and removes it
            System.out.print(temp.data+" ");
            if(temp.left!=null)//Enqueue left child
            {
                queue.add(temp.left);
            }
            if(temp.right!=null)//Enqueue right child
            {
                queue.add(temp.right);
            }    
        }
        System.out.println();
    }
    
    public void preorder()
    {
       Stack<Node> stk=new Stack<Node>();
       stk.push(root);
       while(!stk.isEmpty())
       {
           Node temp=stk.peek();
           System.out.print(temp.data+" ");
           stk.pop();
           if(temp.right!=null)
           {
               stk.push(temp.right);
           }
           if(temp.left!=null)
               
           {
               stk.push(temp.left);
           }            
       }
       System.out.println();
    }
    
    
    public void inorder()
    {
        if(root==null)
        {
            return;
        }
        Stack<Node> stk=new Stack<Node>();
        Node temp=root;
        while(temp!=null||stk.size()>0)
        {    
            while(temp!=null)
               {
                   stk.push(temp);
                   temp=temp.left;
               }
               temp=stk.pop();
               System.out.print(temp.data+" ");
               temp=temp.right;
        }
        System.out.println();
    }
    
    public void postorder()
    {
        Stack<Node> stk1=new Stack<Node>();
        Stack<Node> stk2=new Stack<Node>();
        if(root==null)
        {
            return;
        }
        stk1.push(root);
        while(!stk1.isEmpty())
        {
            Node temp=stk1.pop();
            stk2.push(temp);
            if (temp.left != null) 
                stk1.push(temp.left); 
            if (temp.right != null) 
                stk1.push(temp.right);
        }
        while(!stk2.isEmpty())
        {
            Node temp=stk2.pop();
            System.out.print(temp.data+" ");
        }
    }
    
    public static void main(String[] args)
    {
        BT_Iterative_Traversal bt=new BT_Iterative_Traversal();
        bt.root=new Node(1);
        bt.root.left=new Node(2);
        bt.root.right=new Node(3);
        bt.root.left.left=new Node(4);
        bt.root.left.right=new Node(5);
        bt.root.right.left=new Node(6);
        System.out.println("Level Order Traversal:");
        bt.levelorder();
        /*System.out.println("PreOrder Traversal:");
        bt.preorder();
        System.out.println("InOrder Traversal:");
        bt.inorder();
        System.out.println("PostOrder Traversal:");
        bt.postorder();*/
    }
}
