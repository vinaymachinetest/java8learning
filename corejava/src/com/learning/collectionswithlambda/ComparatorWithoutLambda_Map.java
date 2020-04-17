package com.learning.collectionswithlambda;

import java.util.Comparator;
import java.util.TreeMap;

class CustomizeSorting_Map implements Comparator<Integer>{
	
	@Override
	public int compare(Integer i1 , Integer i2) {
		return (i1 >i2) ? -1 :(i1 < i2) ? 1 : 0 ;
	}
}
public class ComparatorWithoutLambda_Map {
	public static void main(String []args) {
		
		//Default Sorting Ascending order
		TreeMap <Integer, String> map = new TreeMap<Integer, String>();
		map.put(1,"value1");
		map.put(60,"value60");
		map.put(2,"value2");
		map.put(5,"value5");
		map.put(4,"value4");		
		System.out.println("Default sorting Ascending order" + map);
		System.out.println("***********************************************");
		
		//customized sorting descending order
		TreeMap <Integer, String> cmap = new TreeMap<Integer, String>(new CustomizeSorting_Map());
		cmap.put(1,"value1");
		cmap.put(60,"value60");
		cmap.put(2,"value2");
		cmap.put(5,"value5");
		cmap.put(4,"value4");		
		System.out.println("Customized sorting Descending order" + cmap);
	}

}
