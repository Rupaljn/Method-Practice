package com.rakuten.vowel;

public class CheckVowel {
public static boolean vowelConsonant(char c){
	boolean flag = false;
	if(c=='a'&&c=='A'){
		flag = true;
	}
	else if(c=='e'&&c=='E'){
		flag = true;
	}
	else if(c=='i'&&c=='I'){
		flag = true;
	}
	else if(c=='o'&&c=='O'){
		flag = true;
	}
	else if(c=='u'&&c=='U'){
		flag = true;
	}
	
	return flag;
	
}
public static void main(String[] args){
boolean vowel = CheckVowel.vowelConsonant('a');
System.out.println(vowel);
}
}
