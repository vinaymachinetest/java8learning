/*
 * Person validation
 */

package com.learning.predefindefunctionalinterface;

import java.util.function.Predicate;

class Person{
	
	String name;
	int age;
	boolean allow;
	
	Person(String name, int age, boolean allow){
		this.name = name;
		this.age = age;
		this.allow = allow;
	}
	
	@Override
	public String toString() {
		return name;
	}
}

public class Predicate_5 {

	public static void main(String []args) {
		
		Person []person = {
				               new Person("vinay", 29, false),
				               new Person("value1",29, true),
				               new Person("value2",30, true),
				               new Person("kr", 29, false),
		};
		
		Predicate<Person> p = c -> c.age>=18 && c.allow==true;
		
		for(Person details : person) {
			if(p.test(details)) {
				System.out.println("allowed -> " +details);
			}
			else {
				System.out.println("not allowed -> " +details);
			}
		}
	}
}
