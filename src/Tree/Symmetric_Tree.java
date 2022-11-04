/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

/**
 *
 * @author ASUS
 */
public class Symmetric_Tree {
    static class Node
    {
        int data;
        Node left,right;
        Node(int d)
        {
            data=d; 
            right=left=null;
        }
    }
    Node root;
    
    public boolean isSymmetric(Node root,Node root2)
    {
        if(root==null && root2==null)
        {
            return true;
        }
        if(root!=null && root2!=null && root.data==root2.data)
        {
            return(isSymmetric(root.left,root2.right)) && (isSymmetric(root.right,root2.left));
        }
        return false;
    }
    
    public boolean isSymm(Node root)
    {
        return isSymmetric(root, root);
    }
    
    public static void main(String[] args)
    {
        Symmetric_Tree tree=new Symmetric_Tree();
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(2); 
        tree.root.left.left = new Node(3); 
        tree.root.left.right = new Node(4); 
        tree.root.right.left = new Node(4); 
        //tree.root.right.right = new Node(3); 
        System.out.println(tree.isSymm(tree.root));
    }
}
