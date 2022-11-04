/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hashing;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ASUS
 */
public class HashMap_Imple {
    public static void main(String[] args)
    {
        HashMap<String,Integer> h=new HashMap();
        h.put("A",1);
        h.put("B",2);
        h.put("C",3);
        
        System.out.println("Size Of HashMap is "+h.size());
        
        System.out.println(h);
        
        if(h.containsKey("A"))
        {
            int a=h.get("A");
            System.out.println("Value of key is"+a);
        }
        
        for(Map.Entry<String,Integer> e:h.entrySet())//Copying values
            System.out.println(e.getKey()+"  "+e.getValue());
    }
}
