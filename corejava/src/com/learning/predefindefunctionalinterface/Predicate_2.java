/*
 * To display name starts with v
 */

package com.learning.predefindefunctionalinterface;

import java.util.function.Predicate;

public class Predicate_2 {
	
	public static void main(String []args) {
		
		String []names = {"vinay", "name1", "Jhon", "xyz"};
		
		Predicate<String> findname = name -> name.charAt(0) == 'v';
		for(String result : names) {
			if(findname.test(result)) {
				System.out.println(result);
			}
		}
		
	}

}
