/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_Search_Tree;

/**
 *
 * @author Mohanish
 */
public class BinarySearchTree {
    class Node{
        int data;
        Node right,left;
        public Node(int item)
        {
            data=item;
            right=left=null;
        }
    }
    Node root;

    public BinarySearchTree()
    {
        root=null;
    }
    
    //For innserting node
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
        if(root.data>data)
        {
            root.left=insert(root.left,data);
        }
        if(root.data<=data)
        {
            root.right=insert(root.right,data);
        }
        return root;       
    }
    
    public void inorder()  { 
       inorderRec(root); 
    } 
    
    //For searching any node
 /*   void searchrec(int data)
    {
        root=search(root,data);
    }
  
    public Node search(Node root,int data)
    {
        if(root.data==data || root==null)
        {
            return root;
        }
        if(root.data>data)
        {  
           return search(root.left,data);
        }
        if(root.data<data)
        {
            return search(root.right,data);
        }
        else
        {
            System.out.println("Not Found");
        }
        return root;
    }
   */ 
    public void inorderRec(Node root) { 
        if (root != null)
        { 
            inorderRec(root.left); 
            System.out.println(root.data); 
            inorderRec(root.right); 
        } 
    } 
    
    //For Deleting Node
    public void delete(int data)
    {
        root=deleterec(root,data);
    }
    public Node deleterec(Node root,int data)
    {
        Node parent=null;
        Node curr=null;
        while(curr!=null && curr.data!=data)
        {
            parent=curr;
            if(data<curr.data)
            {
                curr=curr.left;
            }
            else
            {
                curr=curr.right;
            }
        }
        if(curr==null)
        {
            return root;
        }
        if(curr.left==null && curr.right ==null)
        {
            if(curr!=root)
            {
                if(parent.left==curr)
                {
                    parent.left=null;
                }
                else
                {
                    parent.right=null;
                }
            }
            else
            {
                root=null;
            }
        }
        
        else 
            if(curr.left!=null && curr.right!=null)
            {
             Node suc=min(curr.right);
             int val=suc.data;
             deleterec(root,suc.data);
             curr.data=val;
            }
        else
            {
                Node child=(curr.left!=null)?curr.left:curr.right;
                root=child;
            }
        
        //If tree is empty
      /*  if(root==null)
        {
            return root;
        }
        //If tree is non-empty then recuring down the tree
        if(data<root.data)
        {
            root.left=deleterec(root.left,data);
        }
        else
            if(data>root.data)
        {
            root.right=deleterec(root.right, data);
        }
        else
            {
                if(root.left==null)//Node to be deleted has one child
                {
                    return root.right;
                }
                if(root.right==null)//Node to be deleted has one child
                {
                    return root.left;
                }
                root.data=min(root.right);
                root.right=deleterec(root.right,data);
            }
       */ return root;
  
    }
    
    public Node min(Node curr)
    {
        while(curr.left!=null)
        {
            curr=curr.left;
        }
        return curr;
    }
    public static void main(String[] args)
    {
        BinarySearchTree bst=new BinarySearchTree();
        bst.ins(50);
        bst.ins(30);
        bst.ins(20);
        bst.ins(40);
        bst.ins(70);
        bst.ins(60);
        bst.ins(80);
        
        bst.inorder();
        bst.delete(20);
        bst.inorder();
        
       // bst.searchrec(90);
        /*
        bst.delete(20);
        System.out.println("Deleting leaf Node");
        bst.inorder();
        
        bst.delete(30);
        System.out.println("Deleting node having one child");
        bst.inorder();
        
        bst.delete(50);
        System.out.println("Deleting Node having 2 child");
        bst.inorder();
    */}
}


//Search and delete is not working
