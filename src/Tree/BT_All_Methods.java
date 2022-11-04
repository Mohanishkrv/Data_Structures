/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingDeque;

/**
 *
 * @author ASUS
 */
public class BT_All_Methods {
    static class Node
    {
        int data;
        Node left,right;
        Node(int data)
        {
            this.data=data;
            left=right=null;
        }
    }
    static Node root;
    public static void levelOrderTraversal()
    {
        System.out.println("Level Order Traversal");
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty())
        {
            Node temp=q.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null)
            {
                q.add(temp.left);
            }
            if(temp.right!=null)
            {
                q.add(temp.right);
            }
        }
        System.out.println();
    }
    public static void preOrderIterative()
    {
        System.out.println("PreOrder Iterative`");
        if(root==null)
            return;
        Stack<Node> stk=new Stack<Node>();
        stk.push(root);
        while(!stk.isEmpty())
        {
            Node temp=stk.peek();
            System.out.print(temp.data+" ");
            stk.pop();
            if(temp.right!=null)
            {
               stk.push(temp.right);
            }
            if(temp.left!=null)
            {
                stk.push(temp.left);
            }
        }
        System.out.println();
    }
    public static void preOrderRecursive()
    {
        System.out.println("PreOrder Recursive");
        rec_PreOrder(root);
        System.out.println();
    }
    public static void rec_PreOrder(Node n)
    {
        if(n==null)
            return;
        System.out.print(n.data+" ");
        rec_InOrder(n.left);
        rec_InOrder(n.right);
    }
    public static void inOrderIterative()
    {
        System.out.println("InOrder Iterative");
        if(root==null)
            return;
        Stack<Node> stk=new Stack<Node>();
        Node temp=root;
        while(temp!=null || stk.size()>0)
        {
            while(temp!=null)
            {
                stk.push(temp);
                temp=temp.left;
            }
            temp=stk.pop();
            System.out.print(temp.data+" ");
            temp=temp.right;
        }
        System.out.println();
            
    }
    public static void inOrderRecursive()
    {
       System.out.println("Recursive InOrder");
       rec_InOrder(root);
       System.out.println();
    }
    public static void rec_InOrder(Node n)
    {
        if(n==null)
            return;
        rec_InOrder(n.left);
        System.out.print(n.data+" ");
        rec_InOrder(n.right);
   }
    public static void postOrderRecursive()
    {
       System.out.println("Recursive PostOrder");
       rec_PostOrder(root);
       System.out.println();
   }
    public static void rec_PostOrder(Node n)
    {
        if(n==null)
            return;
        rec_PostOrder(n.left);
        rec_PostOrder(n.right);
        System.out.print(n.data+" ");
   }
    public static void postOrderIterative()
    {
        System.out.println("PostOrder Iterative");
        Stack<Node> stk1=new Stack<Node>();
        Stack<Node> stk2=new Stack<Node>();
        if(root==null)
            return;
        stk1.push(root);
        while(!stk1.isEmpty())
        {
            Node temp=stk1.pop();
            stk2.push(temp);
            if(temp.left!=null)
            {
                stk1.push(temp.left);
            }
            if(temp.right!=null)
            {
                stk1.push(temp.right);
            }
        }
        while(!stk2.isEmpty())
        {
            System.out.print(stk2.pop().data+" ");
        }
        System.out.println();
        
    }
    public static void postOrderIterative(Node root) 
    {
        System.out.println("PostOrder Iterative one Stack");
        Stack<Node> stack = new Stack<>();
        while(true) 
        {
            while(root != null) {
                stack.push(root);
                stack.push(root);
                root = root.left;
            }
        if(stack.empty()) return;
            root = stack.pop();
        if(!stack.empty() && stack.peek() == root)
            root = root.right;
        else
        {
            System.out.print(root.data + " "); root = null;
        }
        }
    }
    public static void insert(int data)
    {
        Node temp=root;
        if(root==null)
        {
            root=new Node(data);
            return;
        }
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty())
        {
            temp=q.peek();
            q.remove();
            if(temp.left==null)
            {
                temp.left=new Node(data);
                break;
            }
            else
                q.add(temp.left);
            if(temp.right==null)
            {
                temp.right=new Node(data);
                break;
            }
            else
                q.add(temp.right);
        }
    }
    public static int maxDepth_OR_Height(Node n)
    {
        if(n==null)
            return 0;
        else
        {
            int ldepth=maxDepth_OR_Height(n.left);
            int rdepth=maxDepth_OR_Height(n.right);
            if(ldepth>rdepth)
                return ldepth+1;
            else
                return rdepth+1;
        }
    }
    public static boolean FullBT(Node n)
    {
        if(n==null)
            return true;
        if(n.left==null && n.right==null)
            return true;
        if(n.left!=null && n.right!=null)
            return FullBT(n.left) && FullBT(n.right);
        return false;
    }
    public static boolean SymmetricTree(Node n1,Node n2)
    {
        if(n1==null && n2==null)
            return true;
        if(n1!=null && n2!=null && n1.data==n2.data)
            return SymmetricTree(n1.left, n2.right) && SymmetricTree(n1.right, n2.left);
        return false;
    }
    public static void main(String[] args)
    {
        BT_All_Methods bt=new BT_All_Methods();
        bt.root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        levelOrderTraversal();
        preOrderIterative();
        preOrderRecursive();
        inOrderIterative();
        inOrderRecursive();
        postOrderIterative();
        postOrderRecursive();
        postOrderIterative(root);
        int height=maxDepth_OR_Height(root);
        System.out.println("Height of BT="+height);
        boolean FullBt=FullBT(root);
        System.out.println("BT is Full BT="+FullBt);
        boolean symm=SymmetricTree(root, root);
        System.out.println(symm);
        //insert(12);
        //levelOrderTraversal();
        
        
        
    }
}
