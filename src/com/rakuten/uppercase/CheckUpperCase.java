package com.rakuten.uppercase;

public class CheckUpperCase {
public static boolean upperOrLower(char alpha){
	boolean flag = false;
	
	if(alpha>='A'&& alpha<='Z'){
		flag = true;
	}
	else{
		flag = false;
	}
	return flag;
	
}
public static void main(String[] args){
boolean checkCase = CheckUpperCase.upperOrLower('F');
System.out.println(checkCase);
}
}
