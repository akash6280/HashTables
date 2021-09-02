package com.bridgelabz.hashtables;

public class MapNode<K,V> implements NodeIF<K> {
	private K key;
	private V value;
	private NodeIF<K> next;

	public MapNode(K data,V value) {
		this.key = data;
		this.value = value;
		this.next = null;
	}

	public V getValue() {
		return this.value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public K getKey() {
		return this.key;
	}

	public void setKey(K data) {
		this.key = data;
	}

	public void setNext(NodeIF<K> next) {
		this.next = next;
	}

	public NodeIF<K> getNext() {
		return this.next;
	}
}