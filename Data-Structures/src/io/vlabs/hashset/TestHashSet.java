package io.vlabs.hashset;

import java.util.HashSet;

public class TestHashSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("hello");
		set.add("Worlds");
		set.add("hello1");
		set.add("Worlds1");
		set.add("hello2");
		set.add("Worlds2");
		
		for(String s : set) { 
			System.out.println(s);
		}
		System.out.println("==========");
		set.remove("hello");
		for(String s : set) { 
			System.out.println(s);
		}
		
		System.out.println(set.contains("ell"));
		
		

	}

}
