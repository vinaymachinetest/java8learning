/*
 * Functionality of 'This' keyword respect to inner anonymous class and lambda expression
 */

package com.learning.anonymousinnerclass;

interface Interface{
	public void m1();
}

/*public class InnersClass_vs_LambdaExpression {
	
		int x = 888;//instance variable 
		public void m2() {
			
			Interface i = new Interface() {
				
				int x = 999; //instance variable
				public void m1() {
					
					//in respect to inner class 'this' always represent the current object
					System.out.println(this.x);
				}
			};
			i.m1();
		}
		public static void main(String []args) {			
			InnersClass_vs_LambdaExpression obj = new InnersClass_vs_LambdaExpression();
			obj.m2();
		}
}*/

//Below code for lambda expression
public class InnersClass_vs_LambdaExpression {
	
	int x = 888;//instance variable 
	public void m2() {
		
		Interface i = () -> {			
			int x = 999; //local variable and it will be final				
			//in respect to inner class 'this' always represent the current object
			System.out.println(this.x);			
		};
		i.m1();
	}
	public static void main(String []args) {			
		InnersClass_vs_LambdaExpression obj = new InnersClass_vs_LambdaExpression();
		obj.m2();
	}
}



