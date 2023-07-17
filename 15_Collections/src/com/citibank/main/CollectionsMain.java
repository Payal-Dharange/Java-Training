package com.citibank.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. ArrayList");
		List<Integer> numbersList = new ArrayList<>();
		numbersList.add(23);
		numbersList.add(33);
		numbersList.add(23);
		numbersList.add(43);
		numbersList.add(23);
		System.out.println(numbersList);
		numbersList.remove(3);
		System.out.println(numbersList);
		numbersList.addAll(numbersList);
		System.out.println(numbersList);
		System.out.println(numbersList.contains(43));
		System.out.println(numbersList.indexOf(23));
		
		for (Integer integer: numbersList) {
			System.out.println(integer);
//			if(integer== 43) {
//				numbersList.remove(integer);
//			}
		}
		
		System.out.println("2. HashSet");
		Set<String> nameset = new HashSet<>();
		nameset.add("Payal");
		nameset.add("Varsha");
		nameset.add("Varsha");
		nameset.add("Prachi");
		nameset.add("Rohit");
		nameset.add("Abhinav");
		nameset.add("Varsha");
		nameset.add("Rupesh");
		nameset.add("Rohit");
		
		System.out.println(nameset);
		System.out.println("3. TreeSet");
		TreeSet<String> sortednameSet =new TreeSet<>();
		sortednameSet.add("Payal");
		sortednameSet.add("Varsha");
		sortednameSet.add("Varsha");
		sortednameSet.add("Prachi");
		sortednameSet.add("Rohit");
		sortednameSet.add("Abhinav");
		sortednameSet.add("Varsha");
		sortednameSet.add("Rupesh");
		sortednameSet.add("Rohit");
		System.out.println(sortednameSet);
		
		System.out.println("4. HashMap");
		HashMap<Integer, String> hashmap = new HashMap<>();
		hashmap.put(101, "Payal");
		hashmap.put(102, "Payal1");
		hashmap.put(101, "Payal2");
		hashmap.put(104, "Payal3");
		
		System.out.println(hashmap);
		
		

}
}
