package com.javatraining.collection;//try catch final keywords

public class ExceptionEx {
	public static void main(String[] args) {
		int[] a = new int[5];

		try {
			a[6] = 30 / 1;
		} catch (ArithmeticException e) {
			System.out.println("Arthimetic issue");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndex issue");
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("Hello,finally");
		}

	}

}
