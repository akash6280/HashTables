package com.bridgelabz.hashtables;

public class HashMapMain {

	public static void main(String[] args) {
		String sentence= "To be or not to be";
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		String [] words = sentence.toLowerCase().split(" ");
		for(String word:words) {
			Integer value = hashMap.get(word);
			if(value==null) 
				value=1;
			else 
				value=value+1;
			hashMap.add(word, value);
		}
		int frequency = hashMap.get("to");
		System.out.println(frequency);
		
	}

}
