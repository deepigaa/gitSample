package practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PrintArrayElementCount {

	public Map<Integer,Integer> getNumberCount(int[] a){
		Map<Integer,Integer> intMap= new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++){
			int temp = a[i];
			if(intMap.containsKey(temp)){
				intMap.put(temp,intMap.get(temp)+1);
			}else{
				intMap.put(temp, 1);
			}
		}
		return intMap;
	}
	
	public List<Map.Entry<Integer, Integer>> sortByValue(Map<Integer,Integer> map){
		Set<Map.Entry<Integer, Integer>> set = map.entrySet();
		List<Map.Entry<Integer, Integer>> value = new ArrayList<Map.Entry<Integer,Integer>>(set);
		Collections.sort(value,new Comparator<Map.Entry<Integer,Integer>>()
		{
			public int compare(Map.Entry<Integer, Integer> o1,Map.Entry<Integer, Integer> o2){
				return o1.getValue().compareTo(o2.getValue());
			}
			
		});
				
	  return value;
		
	}
	
	public static void main(String[] args){
		int[] arr = {1,3,4,5,6,3,2,4,6,7,9,4,1,2,3,4,6,8,9,7,6,4,3,2,4,7,7,5,2,1,3,4,6,3,1,1,1};
		PrintArrayElementCount  pc = new PrintArrayElementCount();
		Map<Integer,Integer> hm = pc.getNumberCount(arr);
		Set<Integer> keys = hm.keySet();
		for(int key:keys){
			System.out.println(key+"- Repeated "+hm.get(key)+ " times");
		}
		System.out.println("****************");
		System.out.println("Sorting the map by value");
		List<Map.Entry<Integer,Integer>> list = pc.sortByValue(hm);
		for(Map.Entry<Integer, Integer> entry:list){
			System.out.println(entry.getKey()+ "- Repeated " +entry.getValue()+ " times");
		}
	}
}
