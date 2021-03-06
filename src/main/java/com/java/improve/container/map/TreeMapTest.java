package com.java.improve.container.map;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		tmap.put(1, "语文");
		tmap.put(3, "英语");
		tmap.put(2, "数学");
		tmap.put(4, "政治");
		tmap.put(5, "历史");
		tmap.put(6, "地理");
		tmap.put(7, "生物");
		tmap.put(8, "化学");
		for(Entry<Integer, String> entry : tmap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

}
