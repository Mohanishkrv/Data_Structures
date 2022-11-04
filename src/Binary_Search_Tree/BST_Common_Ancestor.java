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
public class BST_Common_Ancestor {
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
    
    public int ancestor(Node root,int l,int h)
    {
        if(root==null)
        {
            return 0;
        }
        else if(root.data> l && root.data>h)
        {
            return ancestor(root.left, l, h);
        }
        else if(root.data<l && root.data<h)
        {
            return ancestor(root.right, l, h);
        }
        return  root.data;
    }
    
    public static void main(String[] args) throws Exception
    {
        BST_Common_Ancestor t=new BST_Common_Ancestor();
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
        String s2[]=br.readLine().split(" ");
        System.out.println("Enter the value of n1 and n2");
        int l=Integer.parseInt(s2[0]);
        int h=Integer.parseInt(s2[1]);
        System.out.println("Common ancestor of "+l+" and "+h+" is "+t.ancestor(t.root,l,h));
    }
}
