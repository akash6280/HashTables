package com.bridgelabz.hashtables;

public class NodeImpl<T> implements NodeIF<T>{
	private T key;
	private NodeIF<T> next;
	
	public NodeImpl(T data) {
		this.key = data;
		this.next = null;
	}

	public T getKey() {
		return key;
	}

	public void setKey(T key) {
		this.key = key;
	}

	public NodeIF<T> getNext() {
		return next;
	}

	public void setNext(NodeIF<T> next) {
		this.next = next;
	}
	
	
}
