/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_Search_Tree;

import java.util.Arrays;

/**
 *
 * @author ASUS
 */
public class PostOrder_from_IN_PRE {
// A utility function to search x in arr[] of size n 
static int search(int arr[], int x, int n) 
{ 
    for (int i = 0; i < n; i++) 
        if (arr[i] == x) 
            return i; 
    return -1; 
} 
  
// Prints postorder traversal from  
// given inorder and preorder traversals 
    static void printPostOrder(int in1[],int pre[], int n) 
    { 
    // The first element in pre[] is  
    // always root, search it in in[]  
    // to find left and right subtrees 
    int root = search(in1, pre[0], n); 
    System.out.print("\nroot="+root);
        // If left subtree is not empty, 
    // print left subtree 
    if (root != 0) 
        printPostOrder(in1, Arrays.copyOfRange(pre, 1, n), root); 
    // If right subtree is not empty, 
    // print right subtree 
    if (root != n - 1) 
        printPostOrder(Arrays.copyOfRange(in1, root+1, n),Arrays.copyOfRange(pre, 1+root, n), n - root - 1); 
    // Print root 
    System.out.println( "\n"+pre[0] + " "); 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int in1[] = { 4, 2, 5, 1, 3, 6 }; 
    int pre[] = { 1, 2, 4, 5, 3, 6 }; 
    int n = in1.length; 
    System.out.println("Postorder traversal " ); 
    printPostOrder(in1, pre, n); 
} 
}
