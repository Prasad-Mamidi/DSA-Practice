package com.dsa.learning;

import java.util.Scanner;

public class Methods {
    static int sum() {
    	Scanner scanner = new Scanner(System.in);
  
    	System.out.println("enter two values");
    	int a=scanner.nextInt();
    	int b=scanner.nextInt();
    	return a+b;
    	}
	public static void main(String[] args) {
		for (int i = 0; i <100; i++) {
			int sum = sum();
			System.out.println(sum);
			
		}
	}

}
