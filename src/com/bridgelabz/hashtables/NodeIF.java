package com.bridgelabz.hashtables;

public interface NodeIF<T> {
		T getKey();
		void setKey(T data);
		
		NodeIF<T> getNext();
		void setNext(NodeIF<T> next);
}

