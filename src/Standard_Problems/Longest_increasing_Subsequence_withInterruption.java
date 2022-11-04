/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Standard_Problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 */
public class Longest_increasing_Subsequence_withInterruption {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            int n=Integer.parseInt(br.readLine());
            String s[]=br.readLine().split(" ");
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=Integer.parseInt(s[i]);
            }
            System.out.println(lsubseq(a,n));
        }
    }
    
    public  static int lsubseq(int a[],int n)
    {
        int c=1;
        int max=1;
        for(int i=0;i<n-1;i++)
        {
            if(a[i]<=a[i+1])
            {
                c++;
            }
            else
            {
                max=Math.max(max,c);
                c=1;                
            }
        }
        return max;
    }
}
