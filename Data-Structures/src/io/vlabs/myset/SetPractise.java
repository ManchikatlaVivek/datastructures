package io.vlabs.myset;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetPractise {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		set.add("hello");
		set.add("hello1");
		set.add("hello2");
		set.add("hello3");
		set.add("hello4");
		for(String set1 :set) {
			System.out.println(set1);
		}
		System.out.println("==============");
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		

	}

}
