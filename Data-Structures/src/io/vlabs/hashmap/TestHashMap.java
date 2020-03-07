package io.vlabs.hashmap;

import java.util.HashMap;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String,Integer>();
		hm.put("alpha", 26);
		hm.put("beta", 30);
		hm.put("vivek", 23);
		hm.put("sravan", 25);
		
		
		Set<String> key = hm.keySet();
		for(String s:key) {
			System.out.println(hm.get(s));
		}
		
		System.out.println(hm.containsKey("sravan"));
		System.out.println(hm.containsKey("sravan1"));
		

	}

}
