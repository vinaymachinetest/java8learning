package com.learning.collectionswithlambda;

import java.util.TreeSet;

public class ComparatorWithLambda_Set {
	public static void main(String []args) {
		//TreeSet<Integer> set = new TreeSet<Integer>((Integer i1, Integer i2) -> (i1>i2) ? -1 :(i1<i2) ? 1 : 0);
	 		//or 
		TreeSet<Integer> set = new TreeSet<Integer>((i1,i2) -> (i1>i2) ? -1 :(i1<i2) ? 1 : 0);
		set.add(11);
		set.add(20);
		set.add(50);
		set.add(5);		
	    System.out.print(set);
	}

}
