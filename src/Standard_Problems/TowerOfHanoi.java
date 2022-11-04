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
public class TowerOfHanoi {
    
    private static void toh(int n,char from,char to,char aux)//acb
    {
        if(n==1)//for disk 1
        {
            System.out.println(">>Move disk 1 from "+from+" to "+to);
            return;
        }//abc
        toh(n-1,from,aux,to);//for current disk except disk 1
        System.out.println("}}}Move disk "+n+" from "+from+" to "+to); 
        toh(n-1,aux,to,from);    
    }
    public static void main(String[] args)
    {
        int n=3;//No. of Disks
        toh(n,'A','C','B');//From A to C,Aux rod B
        //To Count No. of Steps
        int a=(int) Math.pow(2,n);
        int d=a-1;
        System.out.println("Steps="+d);
    }

    
}
