package com.javatraining.basic;

import java.util.Scanner;

public class Calculator {
	 void add(int a, int v) {
		System.out.println(a+v);
	}
	 void sub(int a,int v) {
		System.out.println(a-v);
	}
		 void product(int a,int v) {
			System.out.println(a*v);
		}
			 void div(int a,int v) {
				System.out.println(a/v);
			}

	public static void main(String[] args) {
		System.out.println("Inside main method");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two values");
		int a=sc.nextInt();
		int v=sc.nextInt();
		Calculator c=new Calculator();
		c.add(a, v);
		c.sub(a, v);
		c.product(a, v);
		c.div(a, v);
	
		
		
		
		
	
	}
	
	
}

	


	


