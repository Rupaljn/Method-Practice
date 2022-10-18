package com.rakuten.positivenum;

public class PositiveNegativeZeroNumber {
public static String checkNumber(double num1){
	String result = "";
	
	if(num1>0){
		result = "positive number";
		
	}
	else if(num1<0){
		result = "negative number";
	}
	else{
		result = "zero";
	}
	return result;
}
public static void main(String[] args){
String checkNum = PositiveNegativeZeroNumber.checkNumber(0);	
System.out.println(checkNum);
}
}
