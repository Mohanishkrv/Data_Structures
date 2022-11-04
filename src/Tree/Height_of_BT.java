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
public class Height_of_BT {
    static class Node
    {
        int data;
        Node right,left;
        Node(int item)
        {
            data=item;
            left=right=null;
        }
    }
    Node root;

    public int depth(Node root)
    {
        if(root==null)
            return 0;
        else
        {
            int ld=depth(root.left);
            int rd=depth(root.right);
            if(ld>rd)
                return ld+1;
            else
                return rd+1;
        }
    }
    
    public static void main(String[] args)
    {
        Height_of_BT tree=new Height_of_BT();
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        System.out.print("Height of Tree is :"+tree.depth(tree.root));
    }
}
