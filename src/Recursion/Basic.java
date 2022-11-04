/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author ASUS
 */
public class Basic {
    
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        rec(n);
    }
    
    public static int rec(int n)
    {
        if(n==0)
        {
            return n;
        }
        System.out.print(n+" ");
        return rec(n-1);
    }
}