package com.rakuten.alphabet;

public class CheckAlphabetOrNot {
public static boolean alphabet(char alpha){
	boolean flag = false;
	if((alpha>='a'&&alpha<='z')||(alpha>='A'&&alpha<='Z')){
		flag = true;
	}
	return flag;
}
public static void main(String[] args){
boolean alpha = CheckAlphabetOrNot.alphabet('a');
System.out.println(alpha);
}
}
