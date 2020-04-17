package com.learning.collectionswithlambda;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorWithLambda_UserDefineData {
	int id;
	String name;
	ComparatorWithLambda_UserDefineData(int id, String name){
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return id+ ":" +name;
	}
	public static void main(String []args) {
		
		ArrayList<ComparatorWithLambda_UserDefineData> list = new ArrayList<ComparatorWithLambda_UserDefineData>();
	    list.add(new ComparatorWithLambda_UserDefineData(1, "value1"));
	    list.add(new ComparatorWithLambda_UserDefineData(10, "value10"));
	    list.add(new ComparatorWithLambda_UserDefineData(19, "value19"));
	    list.add(new ComparatorWithLambda_UserDefineData(2, "value2"));
	    list.add(new ComparatorWithLambda_UserDefineData(20, "value20"));
	    Collections.sort(list, (obj1,obj2) -> (obj1.id > obj2.id) ? -1 :(obj1.id < obj2.id) ? 1 : 0);
	    System.out.println(list);
	    	
	}
}
