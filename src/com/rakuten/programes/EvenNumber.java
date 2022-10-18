package com.rakuten.programes;

public class EvenNumber {
public static boolean evenNum(int num){
	 boolean flage = false;
	
	if(num%2==0){
		flage = true;
	} 
	return flage;
	}
public static void main(String[] args) {
boolean evenNo = EvenNumber.evenNum(27);
System.out.println(evenNo);
}
}
