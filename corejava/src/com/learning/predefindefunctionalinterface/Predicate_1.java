/*
 * checking greatest among two numbers using predicate
 * Checking length of given string
 * Checking number is even or odd
 * Checking lArrayList is empty
 */

package com.learning.predefindefunctionalinterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Predicate_1 {

	public static void main(String []args) {
		
		Predicate<Integer> p = i -> i > 10;
		System.out.println(p.test(2));
		System.out.println(p.test(20));
		
		System.out.println("********* Checking length of given string ***** ");
		Predicate<String> p1 = s -> s.length() > 6;
		System.out.println(p1.test("vinay"));
		System.out.println(p1.test("vinay kumar"));
		
		System.out.println("********* Checking number is even or odd ***** ");
		Predicate<Integer> p2 = i -> i%2==0;
		System.out.println(p2.test(2));
		System.out.println(p2.test(5));
		
		System.out.println("********* Checking list is empty ************");
		ArrayList<String> list =new ArrayList<String>();
		Predicate<ArrayList> p3 = l -> l.isEmpty();
		System.out.println(p3.test(list));
		
		System.out.println("**** finding string starts with v ************");
		String [] names= {"vinay", "jan","feb"};
		Predicate<String> p4 = s -> s.charAt(0) == 'v';		
		for(String result : names) {
			if(p4.test(result)) {
				System.out.println(result);
			}
		}
			
		
	}
	
}
