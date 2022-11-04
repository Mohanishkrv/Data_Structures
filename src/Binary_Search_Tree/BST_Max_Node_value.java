/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_Search_Tree;

import com.sun.tools.javac.Main;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 */
public class BST_Max_Node_value {
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
            root.left=insert(root.left,data);
        }
        if(data>=root.data)
        {
            root.right=insert(root.right,data);
        }
        return root;
    }
  
  public int max(Node root)
  {
      int max;
    if(root==null)
        {
            return 0;
        }
      else if(root.right==null)
      {
          return root.data;
      }
      else
      {
          max=max(root.right);
      }
    return max;
  }
  
  public static void main(String args[]) throws Exception
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    BST_Max_Node_value t=new BST_Max_Node_value();
    while(true)
    {
      int n=Integer.parseInt(br.readLine());
      if(n<0)
      {
        break;
      }
      t.ins(n);
    }
    System.out.print("Height of the tree is "+t.max(t.root));
  }
}
