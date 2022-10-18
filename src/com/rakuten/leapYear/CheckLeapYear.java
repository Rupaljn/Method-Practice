package com.rakuten.leapYear;

public class CheckLeapYear {
public static boolean leapYear(int num){
	boolean flag = false;
	if(num%4==0){
		flag = true;
	}
	else{
		flag = false;
	}
	
	return flag;
	
}
public static void main(String[] args){
boolean leapyr = CheckLeapYear.leapYear(2007);
System.out.println(leapyr);
}
}
