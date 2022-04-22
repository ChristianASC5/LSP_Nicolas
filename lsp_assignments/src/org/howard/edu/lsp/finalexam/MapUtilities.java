package org.howard.edu.lsp.finalexam;
import java.util.HashMap;

public class MapUtilities {
	public static int commonKeyValuePairs(
			HashMap<String, String> map1,
			HashMap<String, String> map2) throws NullMapException{
		int count = 0;
		
		if (map1 == null || map2 == null) {
			throw new NullMapException("One or both maps are null!");
			
		}
		else if (map1.size()==0 || map2.size()==0){
			return 0;
		}
		else {
			for (String key : map1.keySet()) {
				if (map2.containsKey(key)) {
					if (map1.get(key).equals(map2.get(key))) {
						count++;
					}
				}
			}
		}
		return count;
	}
}
