package com.prasad.dynamicArray;

import java.util.Arrays;
import java.util.Scanner;

public class SwapArrayValue {
    static int[] swap(int index1,int index2,int[] arr) {
    	int temp=arr[index1];
    	arr[index1]=arr[index2];
    	arr[index2]=temp;
    	return arr;
}
    
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the indexes to swap the values of array");
		int n1=scanner.nextInt();
		int n2=scanner.nextInt();
		
		System.out.println("Enter the size of array");
		int size=scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i]=scanner.nextInt();
		}
//		int[] swap = swap(1,3,10,20,30,40);
		int[] swap = swap(n1,n2,array);
		System.out.println(Arrays.toString(swap));

	}

}
