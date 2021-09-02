package com.bridgelabz.hashtables;

import java.util.*;

public class HashMap<K,V> {
	private int numBuckets;
	ArrayList<LinkedList<K>> bucketArray;
	
	public HashMap() {
		this.numBuckets = 10;
		this.bucketArray = new ArrayList<>(numBuckets);
		for(int i=0;i<numBuckets;i++) {
			bucketArray.add(null);
		}
	}
	
	private int getBucketIndex(K key) {
		int hashCode = Math.abs(key.hashCode());
		int index = hashCode % numBuckets;
		return index;
	}
	
	public V get (K key) {
		int index = this.getBucketIndex(key);
		LinkedList<K> linkedList = bucketArray.get(index);
		if(linkedList == null) {
			return null;
		}
		MapNode<K,V> mapNode = (MapNode<K,V>) linkedList.find(key);
		return (mapNode == null) ? null : mapNode.getValue();
	}
	
	public void add(K key, V value) {
		int index = this.getBucketIndex(key);
		LinkedList<K> linkedList = bucketArray.get(index);
		if(linkedList == null) {
			linkedList = new LinkedList<K>();
			bucketArray.set(index, linkedList);
		}
		MapNode<K,V> mapNode = (MapNode<K,V>) linkedList.find(key);
		if(mapNode == null) {
			mapNode = new MapNode<K, V>(key,value);
			linkedList.append(mapNode);
		} else {
			mapNode.setValue(value);
		}
	}
	
	public void remove(K key) {
		int index = this.getBucketIndex(key);
		LinkedList<K> linkedList = bucketArray.get(index);
		if(linkedList != null) {
			linkedList.deleteNode(key);
		}
	}
}
