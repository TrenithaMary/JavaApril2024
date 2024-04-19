package com.javatraining.basic;

public class Poly { 
	public void run() {
		System.out.println("running");
	}
	public void run(int x) {
		System.out.println(100);
	}
	public void run (String S) {
		System.out.println("Cat");
	}
public static void main(String[] args) {
	System.out.println("Main method");
	Poly p=new Poly();
	p.run();
	p.run(100);
	p.run("Cat");
}

}



