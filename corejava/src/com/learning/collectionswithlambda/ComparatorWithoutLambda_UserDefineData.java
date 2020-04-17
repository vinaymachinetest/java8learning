package com.learning.collectionswithlambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class CustomizedSorting implements Comparator<ComparatorWithoutLambda_UserDefineData>{
	
	@Override
	public int compare(ComparatorWithoutLambda_UserDefineData o1, ComparatorWithoutLambda_UserDefineData o2) {
		return (o1.id > o2.id) ? -1 : (o1.id > o2.id) ? 1 : 0 ;
	}
}

public class ComparatorWithoutLambda_UserDefineData {
	
	int id;
	String name;
	ComparatorWithoutLambda_UserDefineData(int id, String name){
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return id+ ":" +name;
	}
	public static void main(String []args) {
		
		ArrayList<ComparatorWithoutLambda_UserDefineData> list = new ArrayList<ComparatorWithoutLambda_UserDefineData>();
	    list.add(new ComparatorWithoutLambda_UserDefineData(1, "value1"));
	    list.add(new ComparatorWithoutLambda_UserDefineData(10, "value10"));
	    list.add(new ComparatorWithoutLambda_UserDefineData(19, "value19"));
	    list.add(new ComparatorWithoutLambda_UserDefineData(2, "value2"));
	    list.add(new ComparatorWithoutLambda_UserDefineData(20, "value20"));
	    Collections.sort(list, new CustomizedSorting());
	    System.out.println(list);
	    	
	}
}
