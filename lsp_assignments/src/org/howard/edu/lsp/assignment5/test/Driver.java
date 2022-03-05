package org.howard.edu.lsp.assignment5.test;

import org.howard.edu.lsp.assignment5.implementation.*;

public class Driver {

	public static void main(String[] args) {
		
		//Create two empty IntegerSets 
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
//		
//		//Test toString() implementation
//		System.out.println("Value of set1: " + set1);
//		System.out.println("Value of set2: " + set2);
//		
//		//Test length() for empty IntegerSet
//		System.out.println("Length of set1: " + set1.length());
//		System.out.println("Length of set2: " + set2.length());
//		
//		//Test isEmpty() for empty IntegerSet
//		System.out.println("set1 is empty: " + set1.isEmpty());
//		System.out.println("set2 is empty: " + set2.isEmpty());
//		
//		//Test contains() for empty IntegerSet 
//		System.out.println("set1 contains 0: " + set1.contains(0));
//		System.out.println("set2 contains 0: " + set2.contains(0));
//		
//		//Test equals() for if two empty IntegerSets are equal
//		System.out.println("empty set1 equals empty set2: " + set1.equals(set2));
//		
//		
//		//Test that empty IntegerSet throws exception properly for largest()
//		try {
//			set1.largest();
//		}
//		catch (IntegerSetException ex) {
//			System.out.println("Exception caught: " + ex);
//		}
//		
//		//Test that empty IntegerSet throws exception properly for smallest()
//		try {
//			set1.smallest();
//		}
//		catch (IntegerSetException ex) {
//			System.out.println("Exception caught: " + ex);
//		}
//		
//		//Test that empty IntegerSet throws exception properly for remove()
//		try {
//			set1.remove(0);
//		}
//		catch (IntegerSetException ex) {
//			System.out.println("Exception caught: " + ex);
//		}
		
		//Test that add() works properly and doesn't add existing values to IntegerSet
		//Test length() for non empty set
		System.out.println("Initial value of set1: " + set1);
		System.out.println("Initial value of set2: " + set2);
		System.out.println();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(4);
		System.out.println("Value of set1: " + set1);
		System.out.println("Length of set1: " + set1.length());
		System.out.println();
		
		//Test equals() for non empty IntegerSet and empty IntegerSet
		System.out.println("set1 equals empty set2: " + set1.equals(set2));
		System.out.println();
		
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		set2.add(7);
		System.out.println("Value of set2: " + set2);
		System.out.println("Length of set2: " + set2.length());
		System.out.println();
		
		//Test equals() for two non empty IntegerSets
		System.out.println("set1 equals set2: " + set1.equals(set2));
		System.out.println();
		
	}

}
