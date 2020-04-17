package com.learning.collectionswithlambda;

import java.util.TreeMap;

public class ComparatorWithLambda_Map {
	public static void main(String []args) {
		
		TreeMap <Integer, String> map = new TreeMap<Integer, String>((i1,i2) -> (i1>i2) ? -1 :(i1<i2) ? 1 : 0);
		map.put(1,"value1");
		map.put(60,"value60");
		map.put(2,"value2");
		map.put(5,"value5");
		map.put(4,"value4");		
		System.out.println("Customized sorting Descending order" + map);
	}

}
