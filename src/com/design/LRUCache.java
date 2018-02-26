package com.design;

import java.util.LinkedHashMap;

/**
 * Design a LRU cache
 * 
 * @author ashish
 *
 */

public class LRUCache {
	private LinkedHashMap<String, String> cache;
	private int cacheSize;
	
	public LRUCache(int size) {
		this.cacheSize = size;
		
		// True: accessibility order, False: Insertion order
		this.cache = new LinkedHashMap<String, String>(cacheSize, 0.75f, true){		
			private static final long serialVersionUID = 1L;

			@Override
			// This method is called on every insert operation. Hence we check for size here
			protected boolean removeEldestEntry(java.util.Map.Entry<String, String> eldest) {
				return size() > size;
			}
		};
	}
	
	public void print(){
		System.out.println("Cache is now ....");
		for(java.util.Map.Entry<String, String> e : cache.entrySet()) 
			System.out.println(e.getKey() + "-" + e.getValue());
	}
	
	public void add(String k, String v) {
		cache.put(k, v);
	}
	
	public String get(String k) {
		return cache.get(k);
	}
	
	public static void main(String[] args) {
		LRUCache c = new LRUCache(3);
		c.add("A", "A");
		c.print();
		
		c.add("B", "B");
		c.print();
		c.add("C", "C");
		c.print();
		c.add("A", "A");
		c.print();
		c.add("E", "E");
		c.print();
		System.out.println("GETTING ---> " + c.get("C"));
		c.print();
		c.add("D", "D");
		c.print();
		c.add("B", "B");
		c.print();
	}
}
