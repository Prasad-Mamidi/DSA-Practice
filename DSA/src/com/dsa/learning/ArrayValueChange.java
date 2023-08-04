package com.dsa.learning;

import java.util.Arrays;

public class ArrayValueChange {
	static int[] arr = null;
	public static void main(String[] args) {
        // create an array
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void change(int[] nums) {
        // if you make a change to the object via this ref variable, same object will be changed
    }
     @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "Change"+"["+arr+"]"+"Value";
    }
}
