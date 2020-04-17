package com.learning.collectionswithlambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class CustomizeSorting implements Comparator<Integer>{
	
	@Override
	public int compare(Integer i1 , Integer i2) {
		
		/*if(i1>i2) {
			return -1;
		}
		else if(i1<i2) {
			return 1;
		}
		else {
			return 0;
		}*/
		//in a single line		
		return (i1 >i2) ? -1 :(i1 < i2) ? 1 : 0 ;
	}
	
}
public class ComparatorWithoutLambda {
	
	public static void main(String []args) {
		
		ArrayList<Integer> list =new ArrayList<Integer>();
		list.add(10);
		list.add(60);
		list.add(55);
		list.add(5);
		
		//before sorting
		System.out.println("Before Sorting --->" + list);
		Collections.sort(list);
		//after default sorting ascending order
		System.out.println("Default Sorting Ascending order --->" + list);
		
		//Customized sorting using comparator interface in descending order
		Collections.sort(list, new CustomizeSorting());
		System.out.println("Customized Sorting descending order --->" + list);
	}

}
