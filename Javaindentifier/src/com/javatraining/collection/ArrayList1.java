package com.javatraining.collection;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<>();
		l.add("Ravi");
		l.add("sonu");
		l.add("ram");
		l.add("Ravi");

		System.out.println(l);
	
		l.remove(3);
		System.out.println(l);
		l.set(2, "Latha");
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.contains("ramu"));
		
	}

}
