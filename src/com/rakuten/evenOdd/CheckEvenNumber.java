package com.rakuten.evenOdd;

public class CheckEvenNumber {
public static boolean evenOdd(int num){
	boolean result = false;
	if(num%2==0){
		result = true;
	}
	else{
		result = false;
	}
	
	return result;
}
public static void main(String[] args){
boolean num = CheckEvenNumber.evenOdd(0);
System.out.println(num);
}
}
