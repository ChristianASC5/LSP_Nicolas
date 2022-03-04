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
		this.set = new ArrayList<Integer>();
	}
	
	/**
	 * Clears internal representation of the set
	 */
	public void clear() {
		this.set.clear();
	}
	
	/**
	 * Returns the length of the set
	 * @return the length of the set
	 */
	public int length() {
		return this.set.size();
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
		if (this.length() != b.length()){
			return false;
		} 
		else {
			for (int i : this.set) {
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
		return (Collections.binarySearch(this.set, value) != -1);
	}
	
	public int largest() throws IntegerSetException {
		if (this.length() > 0) {
			return Collections.max(this.set);
		}
		else {
			throw new IntegerSetException("this IntegerSet is empty");
		}
	}
	
	public int smallest() throws IntegerSetException {
		if (this.length() > 0) {
			return Collections.min(this.set);
		}
		else {
			throw new IntegerSetException("this IntegerSet is empty");
		}
	}
}
