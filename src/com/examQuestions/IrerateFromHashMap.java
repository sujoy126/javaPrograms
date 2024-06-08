package com.examQuestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IrerateFromHashMap {
	public static void main(String[] args) {
		 Map<String, Integer> m = new HashMap<>();
	        m.put("java", 1);
	        m.put("Automation", 2);
	        m.put("Manual", 3);

	        Iterator<String> iterator = m.keySet().iterator();
	        while (iterator.hasNext()) {
	            String key = iterator.next();
	            System.out.println(key);
	        }
	}

}
