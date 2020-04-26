package com.learnin.helloworld;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test {

	public static void main(String []args) {		
		
		int arr[] = {10,50,90,5,3,1,2};
		
		Predicate<Integer> p1 = n -> n <= 6;
		Predicate<Integer> p2 = n -> n %2==0;	   
		Predicate<Integer> p = p1.and(p2);
		for(int i : arr) {
			
			if(p.test(i)) {
				System.out.println(i);
			}
		}
	}
}
