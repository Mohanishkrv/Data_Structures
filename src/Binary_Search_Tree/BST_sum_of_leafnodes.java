/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_Search_Tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 */
public class BST_sum_of_leafnodes {
    class Node
    {
        int data;
        Node left,right;
        Node(int d)
        {
            data=d;
            left=right=null;
        }
    }
    Node root;

        
    public void ins(int data)
    {
        root=insert(root,data);
    }
    
    public Node insert(Node root,int data)
    {
        if(root==null)
        {
            root=new Node(data);
            return root;
        }
        if(data<root.data)
        {
            root.left=insert(root.left,data);
        }
        if(data>=root.data)
        {
            root.right=insert(root.right,data);
        }
        return root;
    }
    static int sum=0;
    
    public void sum_leaf(Node root)
    {
        if(root==null)
        {
            return;
        }
        if(root.left==null && root.right==null)
        {
            sum+=root.data;
        }
        sum_leaf(root.left);
        sum_leaf(root.right);
        
    }
    
    public static void main(String[] args) throws Exception
    {
        BST_sum_of_leafnodes t=new BST_sum_of_leafnodes();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            int n=Integer.parseInt(br.readLine());
            if(n<0)
            {
                break;
            }
            t.ins(n);
        }
        t.sum_leaf(t.root);
        System.out.println("Sum of all leaf nodes are "+sum);
    }
}
