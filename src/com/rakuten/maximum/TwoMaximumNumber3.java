package com.rakuten.maximum;

public class TwoMaximumNumber3 {
public static double maximum(double num1, double num2){
	double result;
	if(num1>num2){
		result = num1;
	}
	else{
		result = num2;
	}
	
	return result;
}
public static void main(String[] args){
double maximum = TwoMaximumNumber3.maximum(452.57, 574.5);
System.out.println(maximum);
}
}
