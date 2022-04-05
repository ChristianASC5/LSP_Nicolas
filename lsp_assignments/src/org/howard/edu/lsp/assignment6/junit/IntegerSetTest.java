package org.howard.edu.lsp.assignment6.junit;

import org.howard.edu.lsp.assignment6.integerset.*;
import static org.junit.jupiter.api.Assertions.*;
import junit.framework.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IntegerSetTest extends TestCase{
	IntegerSet emptySet1;
	IntegerSet emptySet2;
	IntegerSet oneValueSet1;
	IntegerSet oneValueSet2;
	IntegerSet multiValueSet1;
	IntegerSet multiValueSet2;
	IntegerSet multiValueSet3;
	
	public IntegerSetTest() {}
	
	@BeforeEach
	protected void setUp() {
		//Empty integer sets
		emptySet1 = new IntegerSet();
		emptySet2 = new IntegerSet();
		
		//Integer set with one value
		oneValueSet1 = new IntegerSet();
		oneValueSet1.add(1);
		
		oneValueSet2 = new IntegerSet();
		oneValueSet2.add(4);
		
		//Integer sets with values
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
		multiValueSet3.add(3);
		multiValueSet3.add(4);
		multiValueSet3.add(5);
		multiValueSet3.add(6);
		multiValueSet3.add(7);
		
	}
	
	protected void tearDown() {}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	@DisplayName("Test case for clear")
	public void testClear() {
		emptySet1.clear();
		assertTrue(emptySet1.isEmpty());
		
		emptySet2.clear();
		assertTrue(emptySet2.isEmpty());
		
		oneValueSet1.clear();
		assertTrue(oneValueSet1.isEmpty());
		
		oneValueSet2.clear();
		assertTrue(oneValueSet2.isEmpty());
		
		multiValueSet1.clear();
		assertTrue(multiValueSet1.isEmpty());
		
		multiValueSet2.clear();
		assertTrue(multiValueSet2.isEmpty());
		
		multiValueSet3.clear();
		assertTrue(multiValueSet3.isEmpty());
	}
	
	@Test
	@DisplayName("Test case for length")
	public void testLength() {
		assertEquals(emptySet1.length(), 0);
		assertEquals(emptySet2.length(), 0);
		assertEquals(oneValueSet1.length(), 1);
		assertEquals(oneValueSet1.length(), 1);
		assertEquals(multiValueSet1.length(), 5);
		assertEquals(multiValueSet2.length(), 5);
		assertEquals(multiValueSet3.length(), 5);
		
	}
	
	@Test
	@DisplayName("Test case for equals")
	public void testEquals() {
		assertTrue(emptySet1.equals(emptySet2));
		assertTrue(emptySet2.equals(emptySet1));
		assertFalse(emptySet1.equals(oneValueSet1));
		assertFalse(emptySet1.equals(multiValueSet1));
		
		assertTrue(oneValueSet1.equals(oneValueSet1));
		assertFalse(oneValueSet1.equals(oneValueSet2));
		
		assertTrue(multiValueSet1.equals(multiValueSet2));
		assertTrue(multiValueSet2.equals(multiValueSet1));
		assertFalse(multiValueSet3.equals(multiValueSet1));
	}
	
	@Test
	@DisplayName("Test case for contains")
	public void testContains() {
		assertFalse(emptySet1.contains(0));
		assertFalse(emptySet1.contains(4));
		assertFalse(emptySet2.contains(0));
		assertFalse(emptySet2.contains(7));
		
		assertTrue(oneValueSet1.contains(1));
		assertFalse(oneValueSet1.contains(30));
		assertTrue(oneValueSet2.contains(4));
		assertFalse(oneValueSet2.contains(9));
		
		assertTrue(multiValueSet1.contains(3));
		assertTrue(multiValueSet1.contains(2));
		assertFalse(multiValueSet1.contains(7));
		assertFalse(multiValueSet1.contains(0));
		
		assertTrue(multiValueSet2.contains(3));
		assertTrue(multiValueSet2.contains(2));
		assertFalse(multiValueSet2.contains(7));
		assertFalse(multiValueSet2.contains(0));
		
		assertTrue(multiValueSet3.contains(6));
		assertTrue(multiValueSet3.contains(4));
		assertFalse(multiValueSet3.contains(9));
		assertFalse(multiValueSet3.contains(0));
		
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
