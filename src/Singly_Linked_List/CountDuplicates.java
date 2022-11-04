/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singly_Linked_List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 *Given a singly linked list and a key, count 
 * number of occurrences of given key in linked list.
 * For example, if given linked list is
 * 1->2->1->2->1->3->1 and given key is 1, then
 * output should be 4
 * @author Mohanish
 */
public class CountDuplicates {
    public static void main(String args[]) throws IOException
    {
        LinkedList<Integer> l=new LinkedList<Integer>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String s=br.readLine();
        String sp[]=s.trim().split(" ");
        for(int i=0;i<n;i++)
        {
            l.add(Integer.parseInt(sp[i]));
        }
        int no=Integer.parseInt(br.readLine());
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(l.get(i)==no)
            {
                c++;
            }
        }
        System.out.print(c);
    }
    
}
