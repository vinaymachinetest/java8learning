/*
 * removing null and empty string and adding into arraylist
 */

package com.learning.predefindefunctionalinterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Predicate_3 {
	
	public static void main(String []args) {
		
		String []arr = {"value1", "", null, "value2", "value3"};
		
		Predicate<String> p = string ->  string!=null && string.length() !=0;
		ArrayList<String> list = new ArrayList<String>();
		
		for(String value : arr) {
			
			if(p.test(value)) {
				list.add(value);
			}
		}
		System.out.println(list);
	}

}
