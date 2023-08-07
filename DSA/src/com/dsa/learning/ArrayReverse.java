package com.dsa.learning;

import java.util.Arrays;

public class ArrayReverse {
	static int[] reverse(int...arr) {
    	int temp=0;
    	int s=0;
    	int e=arr.length-1;
    	 while( s<arr.length-1 && e>0 ){
    		if(s!=e) {
    		   temp=arr[s];
    		   arr[s]=arr[e];
    		   arr[e]=temp;
    		   s++;
    		   e--;
    		}
    		else {
    			break;
    		}
    	}
    	return arr;
    }
	public static void main(String[] args) {
		int[] reverse = reverse(10,20,30,40,50);
		System.out.println(Arrays.toString(reverse));

	}

}
