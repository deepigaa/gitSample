package practise;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class CityTempComparator implements Comparator<Map.Entry<String,Integer>> {
	public int compare(Entry<String, Integer> o1,
			Entry<String, Integer> o2) {
		if(o1.getValue()<o2.getValue()){
			return -1;
		}else if(o1.getValue()>o2.getValue()){
			return 1;
		}else{
			//if both the temperature are equal then sort by city value and 
			return o1.getKey().compareTo(o2.getKey());
		}

    }
}
