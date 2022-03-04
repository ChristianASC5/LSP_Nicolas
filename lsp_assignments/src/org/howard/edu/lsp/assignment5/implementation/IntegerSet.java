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
	 * @return the length of this IntegerSet
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
	 * @return true if this IntegerSet contains the value, otherwise false
	 */
	public boolean contains(int value) {
		return this.set.contains(value);
	}
	
	/**
	 * Returns the largest item in the set
	 * @return the largest value in this IntegerSet
	 * @throws IntegerSetException
	 */
	public int largest() throws IntegerSetException {
		if (this.length() > 0) {
			return Collections.max(this.set);
		}
		else {
			throw new IntegerSetException("this IntegerSet is empty");
		}
	}
	
	/**
	 * Returns the smallest item in the set
	 * @return the smallest value in this IntegerSet
	 * @throws IntegerSetException
	 */
	public int smallest() throws IntegerSetException {
		if (this.length() > 0) {
			return Collections.min(this.set);
		}
		else {
			throw new IntegerSetException("this IntegerSet is empty");
		}
	}
	
	public void add(int item) {
		if (this.contains(item) == false) {
			this.set.add(item);
		}
	}
	
	public void remove(int item) throws IntegerSetException {
		if (this.contains(item) == true) {
			this.set.remove(item);
		}
		else {
			throw new IntegerSetException("this set is empty");
		}
	}
	
	public void union(IntegerSet b) {
		if (this.equals(b) == false) {
			try {	
				for (int val = b.smallest(); val <= b.largest(); val++) {
					if (b.contains(val)) {
						this.add(val);
					}
				}
			}
			catch (IntegerSetException ex) {
				System.out.println("Exception caught: " + ex);
			}
			
		}
	}
	
	public void intersection(IntegerSet b) {
		if (this.equals(b) == false) {
			try {
				for (int val = this.smallest(); val <= this.largest(); val++) {
					if ((this.contains(val) && b.contains(val)) == false) {
						this.remove(val);
					}
				}
			}
			catch (IntegerSetException ex) {
				System.out.println("Exception caught: " + ex);
			}
			
		}
	}
	
	public void diff(IntegerSet b) {
		if (this.equals(b)) {
			this.clear();
		}
		else {
			
		}
	}
	
	
}
