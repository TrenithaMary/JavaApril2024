package com.javatraining.collection;

import java.util.ArrayList;

public class ArrayList2 {
	public static void main(String[] args) {
		ArrayList<String> p = new ArrayList<>();
		p.add("tanu");
		p.add("som");
		p.add("tanu");
		p.add("anu");

		System.out.println(p);
		
		p.remove(2);
		System.out.println(p);
		
		p.set(0, "manu");
		System.out.println(p);
		

	}
}
