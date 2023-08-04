package com.dsa.learning;

public class Swap {
    static void swap(int n1,int n2) {
		int temp=n1;
		n1=n2;
		n2=temp;
		System.out.println(n1+"  SWAP "+n2);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=2;
        swap( a, b);
        System.out.println(a+"After Swap"+b);
	}

}
