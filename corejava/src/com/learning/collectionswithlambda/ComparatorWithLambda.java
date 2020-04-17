package com.learning.collectionswithlambda;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorWithLambda {
	public static void main(String []args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(55);
		list.add(22);
		list.add(1);
		
		//Sorting applied using lambda expression
		Collections.sort(list, (Integer i1, Integer i2) -> (i1>i2) ? -1 :(i1<i2) ? 1 : 0);
		System.out.println("Customized Sorting descending order --->" + list);
	}

}
