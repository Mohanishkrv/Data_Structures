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
public class BST_Traversal {
    class Node
    {
        int data;
        Node right,left;
        Node(int d)
        {
            data=d;
            right=left=null;
        }
    }
    Node root;
    
    public void inorder()
    {
        inorderRec(root);
    }
    
    public void inorderRec(Node root)
    {
        if(root!=null)
        {
            inorderRec(root.left);
            System.out.print(root.data+" ");
            inorderRec(root.right);
        }
    }
    
    public void preorder()
    {
        preorderRec(root);
    }
    
    public void preorderRec(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.data+" ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }
    
    public void postorder()
    {
        postorderRec(root);
    }
    
    public void postorderRec(Node root)
    {
        if(root!=null)
        {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data+" ");
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
        BST_Traversal tree=new BST_Traversal();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String s[]=br.readLine().split(" ");
        for(int i=0;i<n;i++)
        {
            tree.ins(Integer.parseInt(s[i]));
        }
        System.out.print("In-Order Traversal:");
        tree.inorder();
        System.out.println();
        System.out.print("Pre-Order Traversal:");
        tree.preorder();
        System.out.println();
        System.out.print("Post-Ord5er Traversal:");
        tree.postorder();
        System.out.println();
    }
}
