/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 */
public class No_Of_Triangels_Polygon {
    
    public static int fact(int x)
    {
        int fact=1;
        for(int i=1;i<=x;i++)
        {
            fact*=x;
        }
        return fact;
    }
    
    static int findTriangles(int n,int b1,int b2) 
    { 
        int no = 0;
        if(b1==b2+1 || b2==b1+1)
        {
            return 0;
        }
        else
        {
            no=fact(n-2)/fact(3)*fact(n-2-3);
        }
        return no;
    } 
    
    public static void main(String [] args) throws Exception
    { 
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    while(t>0)
    {
        String s[]=br.readLine().split(" ");
        int n=Integer.parseInt(s[0]);
        int b1=Integer.parseInt(s[1]);
        int b2=Integer.parseInt(s[2]);
        System.out.println(findTriangles(n,b1,b2));
        t--;
    }
    } 
}
