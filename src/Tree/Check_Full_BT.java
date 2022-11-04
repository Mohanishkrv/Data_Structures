/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ASUS
 */
public class Check_Full_BT {
    static class Node
    {
        int data;
        Node right,left;
        Node(int item)
        {
            data=item;
            right=left=null;
        }
    }
    Node root;
    
    public boolean isFullBinaryTree(Node root)
    {
        Queue<Node> q=new LinkedList();
        q.add(root);
        if(root==null)
        {
            return false;
        }
        else
        {
            while(!q.isEmpty())
            {
                Node n=q.peek();
                q.remove();
                if(n.left==null && n.right==null)
                    continue;
                if(n.left==null || n.right==null)
                    return false;
                q.add(n.left);
                q.add(n.right);
            }
        }
        return true;
    }
    
    public static void main(String[] args)
    {
        Check_Full_BT t=new Check_Full_BT();
        t.root=new Node(1);
        t.root.left=new Node(2);
        t.root.right=new Node(2);
        t.root.left.left=new Node(2);
        t.root.left.right=new Node(2);
        t.root.right.left=new Node(2);
        //t.root.right.right=new Node(2);
        if(t.isFullBinaryTree(t.root)==true)
        {
            System.out.print("Above is Full Binary Tree");
        }
        else
        {
            System.out.print("Above is not a Full Binary Tree");
        }
    }
}
