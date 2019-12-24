package com.interview;

public class StringDemo {

	public static void main(String[] args) {
		String str = "My name is Ankit- My Name";
		
		char[] charArray = str.toCharArray();
		
		char tmp;
		for(int i = 0; i < charArray.length / 2; i++) {
			tmp = charArray[i];
			charArray[i] = charArray[charArray.length-1-i];
			charArray[charArray.length-i-1] = tmp;
		}
		
		System.out.println(charArray);
		System.out.println(str.replaceAll(" ", ""));

	}

}
