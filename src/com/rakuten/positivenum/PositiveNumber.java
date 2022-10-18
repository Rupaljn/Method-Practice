package com.rakuten.positivenum;

public class PositiveNumber {
public static String checkNum(double num1){
	String result = "";
	if(num1>0){
		result = "Positive Number";
		}
	else if(num1<0){
		result = "Negative Number";
	}
	else{
		result = "Zero";
	}
	
	return result;
	}
public static void main(String[] args){
String number = PositiveNumber.checkNum(45);	
System.out.println(number);
}
}
