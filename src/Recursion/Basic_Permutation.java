
package Recursion;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Basic_Permutation 
{   
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        int index=0;            //Starting Index
        String res="";          //To get resultant String
        check(s,index,res);
    }
    //Recursivve approachh
    public static void check(String s,int i,String res)
    {
        int n=s.length();       //Length of main String
        if(i==n)                //When i reaches n i.e. i=n 
        {
            System.out.println(res);
            return;
        }
        check(s,i+1,res+s.charAt(i));
        check(s,i+1,res);
    }
}
