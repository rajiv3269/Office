package com.rajiv.org;

public class Wrapper {
	public static int age = 20;
	
	public static void main(String[] args) {
	   
		 Integer i = Integer.valueOf(age);
	     Integer j = age;
	     
	     System.out.println(age + " " +i +"  "+j);
	}

}
