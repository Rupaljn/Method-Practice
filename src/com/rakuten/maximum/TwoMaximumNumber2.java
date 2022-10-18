package com.rakuten.maximum;

public class TwoMaximumNumber2 {
public static int maximum(int num1, int num2){
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
int maximum = TwoMaximumNumber2.maximum(59, 52);
System.out.println(maximum);
}
}
