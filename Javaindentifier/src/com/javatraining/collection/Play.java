package com.javatraining.collection;

class UserDefined extends Exception {

	public UserDefined(String s) {
		super(s);
	}
}

public class Play {
	public static void main(String[] args) {
	
			try {
				throw  new UserDefined ("This is my UserDefinedException");
			}catch(UserDefined e) {
				System.out.println("This is my UserDefinedException");
				
				
				
			}
	}
}