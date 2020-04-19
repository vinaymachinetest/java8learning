package com.learning.predefindefunctionalinterface;

import java.util.function.Predicate;

public class PredicateJoining {
	
	public static void m1(Predicate<Integer> p , int[] arr) {
		
		for(int result : arr) {
			if(p.test(result)) {
				System.out.println(result);
			}
		}
	}
		
	public static void main(String []args) {
		
		int[] arr = {10,50,20,30,8,9};
			
		Predicate<Integer> p1 = n -> n > 10;
		Predicate<Integer> p2 = n -> n % 2 == 0;
				
		System.out.println("checking greter number");
		m1(p1, arr);
		System.out.println("checking even or odd number");
		m1(p2, arr);		
		/*
		 * joining of predicates
		 * in Predicate functional interface there are one abstract method and 3 default methods 
		 * and one static method 
		 * test(T t)--abstract method
		 * 1. negate()- default method
		 * 2. and() - default method
		 * 3. or() -default method
		 * 4. static isEqual() -- static method
		 */
		System.out.println("number not greater than 10");
		m1(p1.negate(), arr);
		System.out.println("number is greater than 10 and even number");
		m1(p1.and(p2), arr);
		System.out.println("number is greater than 10 or even number");
		m1(p1.or(p2), arr);
		System.out.println("checking given string is equal or not");
		//example of static method of Predicate predefine functional interface
	    Predicate<String> p3 = Predicate.isEqual("lambdaexression");
	    System.out.println(p3.test("hello"));
	}

}
