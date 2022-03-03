package org.howard.edu.lsp.assignment5.implementation;

import java.util.ArrayList;

//class IntegerSetException extends Exception {
//    public IntegerSetException(String s)
//    {
//        // Call constructor of parent Exception
//        super(s);
//    }
//}

public class IntegerSet {
	
	private ArrayList<Integer> set = new ArrayList<Integer>();
	
	/**
	 * 
	 * This is the default constructor for an IntegerSet object
	 * 
	 */
	public IntegerSet() {
	
	}
	
	/**
	 * 
	 * Clears internal representation of the set
	 * 
	 */
	public void clear() {
		set.clear();
	}
	
	/**
	 * 
	 * Returns the length of the set
	 * 
	 */
	public int length() {
		return set.size();
	}
	
	 
	public boolean equals(IntegerSet b) {
		return false;
	}
	
	public boolean contains(int value) {
		return false;
	}
	
	public int largest() throws IntegerSetException {
		return 0;
	}
	
	public int smallest() throws IntegerSetException {
		return 0;
	}
}
