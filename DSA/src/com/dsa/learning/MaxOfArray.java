package com.prasad.dynamicArray;

import java.util.Scanner;

public class MaxOfArray {
    static int max(int...arr) {
    	int max=arr[0];
    	for (int i = 1; i < arr.length; i++) {
    		if(arr[i] > max)
    			 max=arr[i];
		}
    	return max;
    }
    static int max(int start,int end,int...arr) {
    	int max=arr[0];
    	try {
    	for (int i = start; i <end; i++) {
    		if(arr[i] > max)
    			max=arr[i];
    	}
    	}
    	catch(ArrayIndexOutOfBoundsException ae) {
    		ae.getMessage();
    	}
    	return max;
    }
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[in.nextInt()];
        for (int i = 0; i < arr.length; i++) {
        	arr[i]=in.nextInt();
		}
        int s=in.nextInt();
        int e=in.nextInt();
//        int max = max(arr);
        int maxInRange = max(s,e,arr);
//        int max = max(10,40,125,50,23);
//        System.out.println(max);
        System.out.println(maxInRange);
	}
}
