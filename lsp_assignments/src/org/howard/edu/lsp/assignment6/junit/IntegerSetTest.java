package org.howard.edu.lsp.assignment6.junit;

import org.howard.edu.lsp.assignment6.integerset.*;
import static org.junit.jupiter.api.Assertions.*;
import junit.framework.*;

import org.junit.jupiter.api.Test;

class IntegerSetTest extends TestCase{
	IntegerSet emptySet1;
	IntegerSet emptySet2;
	IntegerSet oneValueSet;
	IntegerSet multiValueSet1;
	IntegerSet multiValueSet2;
	IntegerSet multiValueSet3;
	
	public IntegerSetTest() {}
	
	protected void setUp() {
		//Empty integer sets
		emptySet1 = new IntegerSet();
		emptySet2 = new IntegerSet();
		
		//Integer set with one value
		oneValueSet = new IntegerSet();
		
		//Integer set
		multiValueSet1 = new IntegerSet();
		multiValueSet1.add(1);
		multiValueSet1.add(2);
		multiValueSet1.add(3);
		multiValueSet1.add(4);
		multiValueSet1.add(5);
		
		multiValueSet2 = new IntegerSet();
		multiValueSet2.add(1);
		multiValueSet2.add(2);
		multiValueSet2.add(3);
		multiValueSet2.add(4);
		multiValueSet2.add(5);
		
		multiValueSet3 = new IntegerSet();
		
	}
	
	protected void tearDown() {}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test	
	public void testClear() {
		
	}
	
	@Test
	public void testLength() {
		
	}
	
	@Test
	public void testEquals() {
		
	}
	
	public void testContains() {
		
	}
	
	public void testLargest() {
		
	}
	
	public void testSmallest() {
		
	}
	
	public void testAdd() {
		
	}
	
	public void testRemove() {
		
	}
	
	public void testUnion() {
		
	}
	
	public void testIntersection() {
		
	}
	
	public void testDiff() {
		
	}

}
