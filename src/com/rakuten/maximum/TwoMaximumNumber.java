package com.rakuten.maximum;

public class TwoMaximumNumber {
public static int maximumNumber(int num1, int num2){
	int result;
	
	if(num1>num2){
		result = num1;
	}
	else{
		result = num2;
	}
	
	return result;
	}
public static void main(String[] args){
int maximum = TwoMaximumNumber.maximumNumber(34,67);
System.out.println(maximum);
	
}
}
