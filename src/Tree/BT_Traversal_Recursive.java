/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

import com.sun.org.apache.bcel.internal.generic.BALOAD;

/**
 *
 * @author ASUS
 */
public class BT_Traversal_Recursive {
    static class Node
    {
        int key;
        Node left,right;
        Node(int data)
        {
            key=data;
            left=right=null;
        }
    }
    Node root;
    
    public void preorder()
    {
        System.out.println("PreOrder");
        preorder_rec(root);
        System.out.println();
    }
    public void preorder_rec(Node n)
    {
        if(n==null)
        {
            return;
        }
        System.out.print(n.key+" ");
        preorder_rec(n.left);
        preorder_rec(n .right);
    }

    public void postorder()
    {
        System.out.println("PostOrder");
        postorder_rec(root);
        System.out.println();
    }
    public void postorder_rec(Node n)
    {
        if(n==null)
        {
            return;
        }
        postorder_rec(n.left);
        postorder_rec(n .right);
        System.out.print(n.key+" ");
    }
    
    public void inorder()
    {
        System.out.println("InOrder");
        inorder_rec(root);
        System.out.println();
    }
    public void inorder_rec(Node n)
    {
        if(n==null)
        {
            return;
        }
        inorder_rec(n.left);
        System.out.print(n.key+" ");
        inorder_rec(n .right);
    }
    
    public static void main(String[] args)
    {
        BT_Traversal_Recursive t=new BT_Traversal_Recursive();
        t.root=new Node(1);    //                              1
        t.root.left=new Node(2);//                            / \ 
        t.root.right=new Node(3);//                          2   3
        t.root.left.left=new Node(4);//                     /\   /\
        t.root.left.right=new Node(5);//                   4  5  6 7
        t.root.right.left=new Node(6); 
        t.root.right.right=new Node(7);  
        t.preorder();
        t.postorder();
        t.inorder();
    }
}
