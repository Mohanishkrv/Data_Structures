/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Standard_Problems;

/**
 *
 * @author Mohanish
 */
public class SieveOfErasthonese {
    public static void main(String args[])
    {
        int n=50;
        sieve(n);
    }

    private static void sieve(int n) 
    {
        boolean prime[]=new boolean[n+1];
        for(int i=0;i<n;i++)
        {
            prime[i]=true;//Marking all no as prime
        }
        for(int p=2;p*p<n;p++)//Selecting nos 2,3,5...
        {
            if(prime[p]==true)
            {
                for(int i=p*p;i<=n;i=i+p)//checking divisiblity
                {
                    prime[i]=false;
                }
            }
        }
        for(int i=2;i<n;i++)
        {
            if(prime[i]==true)
            {
                System.out.print(i+" ");
            }
        }
    }
    
}
