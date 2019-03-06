package practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*Sorting using separate comparator class
 * Create a map containing city as key and temp as value
 * sort the map based on temperature, 
 * if both the temperature are equal then sort by city value and 
 * display the result
 */

public class SortCityTemp_1 {
	public static void main(String[] args){
		//Create a map containing city as key and temp as value
		Map<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("Mumbai", 27);
		hm.put("Delhi", 25);
		hm.put("Chennai", 27);
		hm.put("Kolkata", 18);
		
		//sort the map based on temperature(value)
		//for sorting a map based on value get the map entries in a set using entrySet()
		//get the set entries in a list
		//sort the list entries using Comparator and Collections.sort()
		//display the result using entry.getKey() and entry.getValue()
		
		//for sorting a map based on value get the map entries in a set and then in a list
		Set<Map.Entry<String,Integer>> set = hm.entrySet();
		
		////get the set entries in a list
		List<Map.Entry<String,Integer>> list = new ArrayList<Map.Entry<String,Integer>>(set);
		
		//sort the list entries using Comparator and Collections.sort()
		Collections.sort(list,new CityTempComparator());
			
		//display the result
		for(Map.Entry<String, Integer> entry: list){
			System.out.println(entry.getKey()+ "----"+entry.getValue());
		}
	}
	

}

