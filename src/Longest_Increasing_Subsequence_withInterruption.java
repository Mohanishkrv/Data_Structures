
import static Standard_Problems.Longest_increasing_Subsequence_withInterruption.lsubseq;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////RECURSIVELY////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////
public class Longest_Increasing_Subsequence_withInterruption {
    static int max=1;//stores the max reference value
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
            System.out.println(lsubseqq(a,n));
        }
    }

    private static int lsubseqq(int[] a, int n) 
    {
        max=1;
        lsubseqqrec(a,n);
        return max;
    }
    public static int lsubseqqrec(int a[],int n)
    {
        if(n==1)
        {
            System.out.println("n="+n);
            return 1;
        }
        int res,max_ending_here=1;//max_ending is length of list
        for(int i=1;i<n;i++)
        {
            res=lsubseqqrec(a,i);
            System.out.println("a  i "+a[i]+" "+i);
            if(a[i-1]<a[n-1] && res+1>max_ending_here)
            {
                max_ending_here=res+1;
                System.out.println("max_ending_here=res+1 "+max_ending_here+" = "+res);
            }
        }
        if(max<max_ending_here)
        {
            System.out.println("max<max_ending_here");
            max=max_ending_here;
        }
        return max_ending_here;
    }
}
