package com.java.examples;

public class EvenOddNumber {

	public static void main(String[] args) {
		System.out.println("The Odd Numbers are:");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("The Even Numbers are:");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
