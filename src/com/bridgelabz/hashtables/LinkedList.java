package com.bridgelabz.hashtables;

public class LinkedList<T> {
	NodeIF<T> head;
	NodeIF<T> tail;
	
	LinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public void add(NodeIF<T> newNode) {		
		if(head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.setNext(head);
			head=newNode;
		}
	}
	
	public void append(NodeIF<T> newNode) {
		if(tail==null)
			this.tail=newNode;
		if(head==null)
			this.head=newNode;
		else
			tail.setNext(newNode);
			tail=newNode;
	}
	
	public void printMyNodes() {
		NodeIF<T>tempNode = head;
		while(tempNode!=null) {
			System.out.print(tempNode.getKey()+" ");
			tempNode=tempNode.getNext();
		}
	}
	
	public void insertNodeBetween(NodeIF<T> beforeNode,NodeIF<T> newNode)
	{
		NodeIF<T>tempNode=beforeNode.getNext();
		beforeNode.setNext(newNode);
		newNode.setNext(tempNode);
		
	}
	
	public void popFirst() {
		head = head.getNext();
	}
	
	public void popLast() {
		
		NodeIF<T> tempNOde = head;
		while (tempNOde.getNext() != tail) {
			tempNOde = tempNOde.getNext();
		}
		tail = tempNOde;
		tail.setNext(null);
	}
	
	public NodeIF<T> find(T key) {
		NodeIF<T> currentNode = head;
		while (currentNode != null) {
			if (currentNode.getKey()==key) {
				return currentNode;
			}
			currentNode = currentNode.getNext();
		}
		return null;
	}
	
	
	public void deleteNode(T key) {
		NodeIF<T> keyNode = find(key);
		if(keyNode == null) {
			return;
		}
		if(head==keyNode) {
			head=null;
			tail=null;
		} else {
			NodeIF<T> temp = head;
			while(temp.getNext()!= keyNode) {
				temp = temp.getNext();
			}
			temp.setNext(keyNode.getNext());
			if(keyNode == tail) {
				tail = temp;
			}
		}
	}

	
	public int size() {
		int length = 0;
		NodeIF<T> temp = head;
		while (temp != null) {
			temp = temp.getNext();
			length++;
		}
		return length;
	}
	
	public void popAll() {
		while(head!=null) {
			System.out.println(head.getKey());
			head = head.getNext();
		}
	}
	
}