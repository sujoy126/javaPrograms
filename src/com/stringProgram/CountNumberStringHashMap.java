package com.stringProgram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountNumberStringHashMap {
	
	public static void main(String[] args) {
		String str = "burn your potential";
		String st[] = str.split(" ");
		Map<String, Integer> m = new HashMap<>();
		
		for(String s: st) {
			if(m.containsKey(st)) {
				m.put(s, m.get(s)+1);
			}
			else {
				m.put(s, 0);
			}
		}
		for(String p: m.keySet()) {
			System.out.println(p+" : "+m.get(p));
		}

	}

}
