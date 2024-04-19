package com.javatraining.collection;

import java.util.HashSet;

public class HashSet1 {public static void main(String[] args) {
	HashSet<String> l=new HashSet<>();
	l.add("rajesh");
	l.add("suresh");
	l.add("tejesh");
	l.add("rajesh");
	l.add(null);
	l.add(null);
	System.out.println(l);
}
}
