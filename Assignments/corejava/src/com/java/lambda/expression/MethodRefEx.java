package com.java.lambda.expression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;


public class MethodRefEx {

	public static void main(String[] args) {
		
		String[] countries = {"India", "USA", "China"};
		Collection<String> country = Arrays.asList(countries);
		
		System.out.println("for-each loop");
		
		for(String con:country) {
			System.out.println(con);
		}
		
		System.out.println("iterator ");
		Iterator<String> itr = country.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		MethodRefEx  obj = new MethodRefEx();
		
		country.forEach(item -> obj.displayItem(item) );
		
		country.forEach(obj::displayItem);
	
		
		Supplier<List<String>> createList = () -> {return new ArrayList<String>();};
		List<String> citiList = createList.get();
		System.out.println(citiList);
	}
	
	public void displayItem(String str) {
		System.out.println(str);
	}

	

}
