/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Standard_Problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 *
 * @author ASUS
 */
public class Shift_for_Balnced_Parantheses {
    public static void main(String[] args) throws Exception
    {
        LinkedList<String> l=new LinkedList();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().split("");
        //System.out.print(swapCount(s));
        for(int i=0;i<s.length;i++)
        {
            l.add(s[i]);
        }
        System.out.print(no_of_shift(l));
    }
    
    ////Normal   
    static long swapCount(String s)  
    { 
        char[] chars = s.toCharArray(); 
          
        // stores total number of Left and Right  
        // brackets encountered 
        int countLeft = 0, countRight = 0;  
                // swap stores the number of swaps required 
        //imbalance maintains the number of imbalance pair 
        int swap = 0 , imbalance = 0;  
          
        for(int i =0; i< chars.length; i++)  
        { 
            if(chars[i] == '(')  
            { 
                // increment count of Left bracket 
                countLeft++;  
                if(imbalance > 0)  
                { 
                    // swaps count is last swap count + total  
                    // number imbalanced brackets 
                    swap += imbalance;  
                    // imbalance decremented by 1 as it solved 
                    // only one imbalance of Left and Right 
                    imbalance--;      
                } 
            } else if(chars[i] == ')' )  
            { 
                // increment count of Right bracket 
                countRight++;  
                // imbalance is reset to current difference  
                // between Left and Right brackets 
                imbalance = (countRight-countLeft);  
            } 
        } 
        return swap; 
    } 
    
    //Using LL
    public static int no_of_shift(LinkedList<String> l)
    {
        int countl=0,countr=0;
        int shift=0,imbalance=0;
        for(int i=0;i<l.size();i++)
        {
            if(l.get(i).equals("("))
            {
                countl++;
                if(imbalance>0)
                {
                    shift+=imbalance;
                    imbalance--;
                }
            }
            else if(l.get(i).equals(")"))
            {
                countr++;
                imbalance=countr-countl;
            }
        }
        return shift;
    }
}
