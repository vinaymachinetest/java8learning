//Resolving the conflicts while implementing two interface having same method implementation
package com.learning.defaultmethods;

/*public class ImplementationClass implements Interface1,Interface2{
	
	public void m1() {
		System.out.println("we can resolve the conflicts by overriding the method");
	}
	
	public static void main(String []args) {
		
		ImplementationClass obj = new ImplementationClass();
		obj.m1();
		//OR
		Interface1 obj1 = new ImplementationClass();
		obj1.m1();
		//OR
		Interface2 obj2 = new ImplementationClass();
		obj2.m1();	
	}
	

}*/

//Another way to resolve the conflicts
public class ImplementationClass implements Interface1,Interface2{
	
	public void m1() {
	     Interface1.super.m1();
	     Interface2.super.m1();
	}	
	public static void main(String []args) {
		ImplementationClass obj = new ImplementationClass();
		obj.m1();		
	}
}

