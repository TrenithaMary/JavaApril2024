package com.javatraining.collection;

import java.util.HashMap;

public class HashExam1 {
public static void main(String[] args) {
	HashMap<Integer,String> st=new HashMap<>();
	st.put(111, "java");
	st.put(112, "javascript");
	st.put(113, "HTML");
	st.put(114, "CSS");
	
	System.out.println(st);
	
	String s=st.get(114);
	System.out.println(s);
}
}
