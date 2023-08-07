package com.prasad.dynamicArray;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {
       Scanner in = new Scanner(System.in);		
	  /* ArrayList<Integer> list = new ArrayList<Integer>();
	   list.add(12);
	   list.add(3);
	   list.add(4);
	   list.add(6);
	   list.add(2);
	   System.out.println(list);*/
	   
	   // 2D array using arrayList
	    /*ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	    for (int i = 0; i < 5; i++) {
	    	list.add(new ArrayList<Integer>());
		}
	   for(int i=0;i<5;i++) {
		   for(int j=0;j<3;j++) {
			   list.get(i).add(in.nextInt());
		   }
	   }
	   System.out.println(list); */
	  
	   // implement the jagged 2D array
	   ArrayList<ArrayList<Integer>> alist = new ArrayList<ArrayList<Integer>>();
	   ArrayList<Integer> row1 = new ArrayList<Integer>();
	   row1.add(12);
	   row1.add(24);
	   row1.add(36);
	   row1.add(48);
	   row1.add(60);
	   ArrayList<Integer> row2 = new ArrayList<Integer>();
	   row2.add(3);
	   row2.add(6);
	   row2.add(9);
	   ArrayList<Integer> row3 = new ArrayList<Integer>();	
		row3.add(5);
		row3.add(10);
		row3.add(15);
		row3.add(20);
		
		System.out.println(alist);
		alist.add(row1);
		alist.add(row2);
		alist.add(row3);
		System.out.println(alist);
		Integer integer = alist.get(0).get(3);
		System.out.println(integer);
		for (ArrayList al : alist) {
			System.out.println(al);
		}
		
		for (int i = 0; i < alist.size(); i++) {
            ArrayList<Integer> row = alist.get(i);
            for (int j = 0; j < row.size(); j++) {
                int element = row.get(j);
                System.out.print(element + " ");
            }
            System.out.println(); // Move to the next row
        }
		
		
		
		
		
		

	}

}
