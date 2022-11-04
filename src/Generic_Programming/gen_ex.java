/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generic_Programming;

/**
 *
 * @author Mohanish
 */

//Non Generic Programming
/*public class gen_ex { 
    private Object t;

	public Object get() {
		return t;
	}

	public void set(Object t) {
		this.t = t;
	}

        public static void main(String args[]){
		gen_ex type = new gen_ex();
		type.set("Pankaj"); 
		String str = (String) type.get(); //type casting, error prone and can cause ClassCastException
                System.out.println("O/P"+type.get());
                type.set(122);
                //String st = (String) type.get();//Cause ClassCastException
                //Type casting is needed every time
                //Makes the code length
                Integer in=(Integer) type.get();
                System.out.println("O/P"+type.get());
                        
	}
}
*/
public class gen_ex<T> {

	private T t;
	
	public T get(){
		return this.t;
	}
	
	public void set(T t1){
		this.t=t1;
	}
	
	public static void main(String args[]){
		gen_ex<String> type = new gen_ex<>();
		type.set("Pankaj"); //valid     
                System.out.println("OPP"+type.get());
		
		gen_ex type1 = new gen_ex(); //raw type
                //When raw type is converted into integer generic than error occurs at next line because it is in String i.e error at runntim
                gen_ex<Integer> type1 = new gen_ex<>();
		type1.set("Pankaj"); //valid
		type1.set(10); //valid and autoboxing support
                System.out.println("OP"+type1.get());
	}
}