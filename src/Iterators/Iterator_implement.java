/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterators;

import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author ASUS
 */
public class Iterator_implement {
    public static void main(String[] args)
    {
        Stack a=new Stack<Integer>();
        a.push(1);
        a.push(2);
        a.push(3);
        a.peek();
        Iterator<Integer> it=a.iterator();
        System.out.print(it.next()+"");
        System.out.print(it.next()+"");
    }
}
