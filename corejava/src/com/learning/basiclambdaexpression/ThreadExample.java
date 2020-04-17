package com.learning.basiclambdaexpression;

public class ThreadExample {
	
	public static void main(String []args) {
		
		Runnable run =  () -> {
			
			 for(int i=0;i<10;i++){
	                System.out.println("Example of creating child thread using lambda expression");
	            }			
		};
		Thread thread = new Thread(run);
		thread.start();
		for(int i=0;i<10;i++){
            System.out.println("Example of creating main thread");
        }
	}

}
