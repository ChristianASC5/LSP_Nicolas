package org.howard.edu.lsp.assignment5.implementation;

import java.util.ArrayList;
import java.util.Collections;

//class IntegerSetException extends Exception {
//    public IntegerSetException(String s)
//    {
//        // Call constructor of parent Exception
//        super(s);
//    }
//}

public class IntegerSet {
	
	private ArrayList<Integer> set;
	
	/**
	 * This is the default constructor for an IntegerSet object
	 * Initializes set attribute
	 */
	public IntegerSet() {
		set = new ArrayList<Integer>();
	}
	
	/**
	 * Clears internal representation of the set
	 */
	public void clear() {
		set.clear();
	}
	
	/**
	 * Returns the length of the set
	 * @return
	 */
	public int length() {
		return set.size();
	}
	
	 
	/**
	 * 
	 * Returns true if the 2 sets are equal, false otherwise. 
	 * Two sets are equal if they contain all of the same values in ANY order.
	 * 
	 * @param b the IntegerSet this set is being compared to
	 * @return true if this IntegerSet is equal to IntegerSet b, false otherwise
	 */
	public boolean equals(IntegerSet b) {
		if (length() != b.length()){
			return false;
		} 
		else {
			for (int i : set) {
				if (b.contains(i) == false) {
					return false;
				}
			}
		}
		return true;	
	}
	
	/**
	 * Returns true if the set contains the value, otherwise false
	 * @param value
	 * @return
	 */
	public boolean contains(int value) {
		return (Collections.binarySearch(set, value) != -1);
	}
	
	public int largest() throws IntegerSetException {
		return 0;
	}
	
	public int smallest() throws IntegerSetException {
		return 0;
	}
}
