package com.learning.collectionswithlambda;

import java.util.Comparator;
import java.util.TreeSet;

class CustomizeSorting_Set implements Comparator<Integer>{
	
	@Override
	public int compare(Integer i1 , Integer i2) {
		return (i1 >i2) ? -1 :(i1 < i2) ? 1 : 0 ;
	}
}
public class ComparatorWithoutLambda_Set {
	public static void main(String []args) {
		
		//Default Sorting Ascending order
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(50);
		set.add(5);		
	    System.out.println("Default sorting Ascending order " + set);
	    
	    System.out.println("***********************************************");
	   //customized sorting descending order
		TreeSet<Integer> cset = new TreeSet<Integer>(new CustomizeSorting_Set());
		cset.add(10);
		cset.add(20);
		cset.add(50);
		cset.add(5);		
	    System.out.print("Customized sorting Descending order " + cset);
		
	}

}
