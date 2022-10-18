package com.rakuten.programes;

public class OddNumber {
public static boolean oddNum(int num){
	boolean flag = false;
	
	if(num%2!=0){
		flag = true;
	}
	return flag;
}
public static void main(String[] args) {
boolean oddNo = OddNumber.oddNum(25);
boolean oddNo1 = OddNumber.oddNum(24);
System.out.println(oddNo);
System.out.println(oddNo1);
}
}
