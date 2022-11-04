/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;
import java.util.Scanner;
/**
 *
 * @author Mohanish
 */
public class Array_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          System.out.println("Enter Array Size");
        int s=sc.nextInt();
      
        int[] a=new int[s];
        System.out.println("Enter Elements");
        for(int i=0;i<s;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Output");
        for(int i=0;i<s;i++)
        {
            System.out.println(a[i]);
        }
    }
}
