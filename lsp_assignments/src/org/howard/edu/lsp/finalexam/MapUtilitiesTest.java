package org.howard.edu.lsp.finalexam;

import java.util.HashMap;
import org.howard.edu.lsp.finalexam.MapUtilities;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class MapUtilitiesTest extends TestCase{
	HashMap<String, String> nullMap1;
	HashMap<String, String> nullMap2;
	HashMap<String, String> emptyMap1;
	HashMap<String, String> emptyMap2;
	HashMap<String, String> map1;
	HashMap<String, String> map2;
	HashMap<String, String> map3;
	HashMap<String, String> map4;
	HashMap<String, String> map5;

	@BeforeEach
	protected void setUp() {
		//Empty HashMaps
		emptyMap1 = new HashMap<String, String>();
		emptyMap2 = new HashMap<String, String>();
		
		//HashMaps populated with various values
		map1 = new HashMap<String, String>();
		map1.put("Alice", "Healthy");
		
		map2 = new HashMap<String, String>();
		map2.put("Tam", "Fine");
		
		map3 = new HashMap<String, String>();
		map3.put("Alice", "Healthy");
		map3.put("Mary", "Estatic");
		map3.put("Bob", "Happy");
		map3.put("Chuck", "Fine");
		map3.put("Felix", "Sick");
		
		map4 = new HashMap<String, String>();
		map4.put("Mary", "Estatic");
		map4.put("Felix", "Healthy");
		map4.put("Ricardo", "Subperb");
		map4.put("Tam", "Fine");
		map4.put("Bob", "Happy");
		
		map5 = new HashMap<String, String>();
		map5.put("Mary", "Estatic");
		map5.put("Felix", "Healthy");
		map5.put("Ricardo", "Subperb");
		map5.put("Tam", "Fine");

	}

	@Test
	@DisplayName("Tast case for commonKeyValuePairs")
	public void testCommonKeyValuePairs() throws NullMapException{
		assertEquals(MapUtilities.commonKeyValuePairs(emptyMap1, emptyMap1), 0);
		assertEquals(MapUtilities.commonKeyValuePairs(emptyMap1, map1), 0);
		assertEquals(MapUtilities.commonKeyValuePairs(emptyMap1, map2), 0);
		assertEquals(MapUtilities.commonKeyValuePairs(emptyMap1, map3), 0);
		assertEquals(MapUtilities.commonKeyValuePairs(emptyMap1, map4), 0);
		
		assertEquals(MapUtilities.commonKeyValuePairs(map1, map2), 0);
		assertEquals(MapUtilities.commonKeyValuePairs(map1, map3), 1);
		assertEquals(MapUtilities.commonKeyValuePairs(map2, map3), 0);
		assertEquals(MapUtilities.commonKeyValuePairs(map2, map4), 1);
		assertEquals(MapUtilities.commonKeyValuePairs(map3, map4), 2);
		assertEquals(MapUtilities.commonKeyValuePairs(map4, map5), 4);
	}
	
	@Test
	@DisplayName("Test case for when commonKeyValuePairs throws NullMapException")
	public void testCommonKeyValuePairs_THROWS_EXCEPTION(){
	
		//Two null maps
		Throwable exception = assertThrows(NullMapException.class, () -> MapUtilities.commonKeyValuePairs(nullMap1, nullMap2));
		assertEquals("One or both maps are null!", exception.getMessage());
		
		//One null map
		Throwable exception1 = assertThrows(NullMapException.class, () -> MapUtilities.commonKeyValuePairs(nullMap1, map2));
		assertEquals("One or both maps are null!", exception1.getMessage());
		
		//Two null values
		Throwable exception2 = assertThrows(NullMapException.class, () -> MapUtilities.commonKeyValuePairs(null, null));
		assertEquals("One or both maps are null!", exception2.getMessage());
	}
	

}
