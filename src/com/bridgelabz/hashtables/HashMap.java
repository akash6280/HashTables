package com.bridgelabz.hashtables;


public class HashMap<K,V> {
	LinkedList<K> linkedList;
	
	public HashMap() {
		this.linkedList = new LinkedList<K>();
	}
	
	public V get (K key) {
		MapNode<K,V> mapNode = (MapNode<K,V>)linkedList.find(key);
		return (mapNode == null) ? null : mapNode.getValue();
	}
	
	public void add(K key, V value) {
		MapNode<K,V> mapNode = (MapNode<K,V>)linkedList.find(key);
		if(mapNode == null) {
			mapNode = new MapNode<K, V>(key,value);
			this.linkedList.append(mapNode);
		} else {
			mapNode.setValue(value);
		}
	}
}
