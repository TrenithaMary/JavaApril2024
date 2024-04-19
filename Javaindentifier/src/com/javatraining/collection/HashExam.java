package com.javatraining.collection;//Hash Map.

import java.util.HashMap;

public class HashExam {
	
	public static void main(String[] args) {
		HashMap<String,Integer> st=new HashMap<>();
		
		st.put("sonu", 101);
		st.put("monu", 102);
		st.put("tanu", 103);
		st.put("sonu", 106);
		System.out.println(st);
		
		st.remove("tanu");
		System.out.println(st);
	}

}
//we cannot enter the same name because it overrides ex sonu and sonu {tanu=103, sonu=106, monu=102}
