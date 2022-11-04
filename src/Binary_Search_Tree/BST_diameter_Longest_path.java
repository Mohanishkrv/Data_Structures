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
public class BST_diameter_Longest_path {
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
    
    public int height(Node root)
    {
        if(root==null)
            return 0;
        else
        {
            return (1+Math.max(height(root.left),height(root.right)));
        }
    }
    
    public int dia(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        else
        {
            int lh=height(root.left);
            int rh=height(root.right);
            int ld=dia(root.left);
            int rd=dia(root.right);
            return Math.max(lh+rh+1,Math.max(ld,rd));
        }
    }
    
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
    
    public static void main(String[] args) throws Exception
    {
        BST_diameter_Longest_path t=new BST_diameter_Longest_path();
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
        
        
        System.out.print(t.dia(t.root));
    }
}
