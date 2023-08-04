package com.dsa.learning;

public class Overloading {
    static void add() {
    	System.out.println(10+20);
    }
    
    static void add(int a) {
    	System.out.println(a+10);
    }
    static void add(int a,int b) {
    	System.out.println(a+b);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        add();
        add(10);
        add(20,10);
	}

}
