package org.howard.edu.lsp.assignment5.implementation;

/**
 * Custom exception to handle errors within the IntegerSet class
 * @author cnico
 */
public class IntegerSetException extends Exception{

	/**
	 * Default constructor for an IntegerSetException object with a message.
	 * @param str message for this IntegerSetException when constructor is called.
	 */
	public IntegerSetException(String str) {
		super(str);
	}
	
}
