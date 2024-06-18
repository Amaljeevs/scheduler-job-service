package com.alfaris.schedulerservice.job;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
	/**
	 * LRUCache Class For Least Recently Used algorithm.
	 */
	private static final long serialVersionUID = 1L;
	private final int capacity;

	public LRUCache(int capacity) {
		super(capacity, 0.75f, true);
		this.capacity = capacity;
	}

	@Override
	protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
		return size() > capacity;
	}
}
