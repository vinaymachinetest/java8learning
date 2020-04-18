/*
 * Creating Thread using anonymousinnerclass class
 * And
 * With Lambda Expression by replacing inner class
 */

package com.learning.anonymousinnerclass;

public class AnonymousInnerClass {
	
	public static void main(String []args) {
		
		//Creating thread using anonymous inner class
		Runnable r = new Runnable(){
			public void run() {
			for(int i =0; i<=10 ;i++) {
				System.out.println("child thread");
			}
		  }
		};
		Thread t = new Thread(r);
		t.start();
		for(int i =0; i<=10 ;i++) {
			  System.out.println("main thread");
			}
		
		//Creating a thread using lambda expression 
		Runnable lambda = () -> {			
			for(int i =0; i<=10 ;i++) {
				System.out.println("child thread using lambda expression");
			}
		};		
		Thread t1 = new Thread(lambda);
		t1.start();
		for(int i =0; i<=10 ;i++) {
		  System.out.println("main thread using lambda expression");
		}
		
		// In another way of creating thread using lambda expression		
		Thread t2 = new Thread(() -> {			
			for(int i =0; i<=10 ;i++) {
				System.out.println("child thread using lambda expression");
			}
		});
		t2.start();
		for(int i =0; i<=10 ;i++) {
		  System.out.println("main thread using lambda expression");
		}
	}
}


