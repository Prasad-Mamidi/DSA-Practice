package com.dsa.learning;

import java.util.Arrays;

public class Varargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		fun(1,2,6,4);
		fun('c',2,3,4,66,6,56);
		
	}
	static void fun(char a, int b,int ...i) {
		i[2]=44;
		System.out.println(i.length);
		System.out.println(Arrays.toString(i));
	}

}
