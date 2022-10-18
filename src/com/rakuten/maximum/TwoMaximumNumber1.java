package com.rakuten.maximum;

public class TwoMaximumNumber1 {
public static int maximumNum(int num1, int num2){
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
int maximum = TwoMaximumNumber1.maximumNum(23,56);
System.out.println(maximum);
}
}
