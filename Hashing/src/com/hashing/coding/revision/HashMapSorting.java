package com.hashing.coding.revision;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class HashMapSorting {

	public static void main(String[] args) {
		
		Map<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("a", 4);
		hm.put("b", 3);
		hm.put("e", 1);
		hm.put("c", 2);
		hm.put("d", 1);

		System.out.println("before sorting " +hm);
	LinkedHashMap<String, Integer>	 sorted=hm.entrySet().stream().sorted((e1,e2) ->{
			return e1.getValue()-e2.getValue();
		}).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue , (e1,e2) ->e1, LinkedHashMap::new));
		
	System.out.println(sorted);
	
	List<Map.Entry<String, Integer>> list=new LinkedList<Map.Entry<String,Integer>>(hm.entrySet());
	
Collections.sort(list, (i1,i2) ->i1.getValue().compareTo(i2.getValue()));
	
	Map<String,Integer> map=new LinkedHashMap<String, Integer>();
	for (Map.Entry<String, Integer> entry : list) {
		map.put(entry.getKey(), entry.getValue());
	}
	
	System.out.println("another wya " +map);
	
	}

}
