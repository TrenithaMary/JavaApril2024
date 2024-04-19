package com.javatraining.collection;

import java.util.Scanner;

public class ExceptionClass2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int x=sc.nextInt();
	int y=sc.nextInt();

	try {
		System.out.println(x/y);
	}catch(ArithmeticException e) {
		System.out.println("can not divide by zero");
	}
	
	
		
}
}
