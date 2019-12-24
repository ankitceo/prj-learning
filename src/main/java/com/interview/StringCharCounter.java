package com.interview;

public class StringCharCounter {

	public static void main(String[] args) {
		String str = "My name is Ankit- My Name";
		
		char[] charArray = str.toCharArray();
		
		int tmp = 0;
		for(int i = 0; i < charArray.length; i++) {
			if(charArray[i] == 'm' || charArray[i] == 'M') {
				tmp++;
			}
		}
		
		System.out.println(tmp);

	}

}
