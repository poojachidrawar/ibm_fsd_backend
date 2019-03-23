package com.java.oopsex;

public interface Appriasable {
	
	public void appraise();
	default void test() {
		System.out.println("test");
	}
	
	default void test1() {
		System.out.println("test1");
	}
	
	static void testdata() {
		System.out.println("testdata");
	}
	
	static void testdata1() {
		System.out.println("testdata1");
	}
}
