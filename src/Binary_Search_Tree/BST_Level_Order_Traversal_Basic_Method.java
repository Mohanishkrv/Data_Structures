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
public class BST_Level_Order_Traversal_Basic_Method {
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
            root.left=insert(root.left, data);
        }
        if(data>=root.data)
        {
            root.right=insert(root.right, data);
        }
        return root;
    }
    
    void printLevelOrder() 
    { 
        int h = height(root); 
        for (int i=1; i<=h; i++) 
            printGivenLevel(root, i); 
    } 
  
    int height(Node root) 
    { 
        if (root == null) 
           return 0; 
        else
        {   
            int lh = height(root.left); 
            int rh = height(root.right); 
            if (lh > rh) 
                return(lh+1); 
            else 
                return(rh+1);  
        } 
    } 
    
    void printGivenLevel (Node root ,int level) 
    { 
        if (root == null) 
            return; 
        if (level == 1) 
            System.out.print(root.data + " "); 
        else if (level > 1) 
        { 
            printGivenLevel(root.left, level-1); 
            printGivenLevel(root.right, level-1); 
        } 
    } 
    
    public static void main(String[] args) throws Exception
    {
        BST_Level_Order_Traversal_Basic_Method tree=new BST_Level_Order_Traversal_Basic_Method();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            int n=Integer.parseInt(br.readLine());
            if(n<0)
            {
                break;
            }
            tree.ins(n);
        }
        tree.printLevelOrder();
    }
}
