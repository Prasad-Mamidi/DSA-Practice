package com.dsa.learning;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
//          int a = scanner.nextInt();
//          int b = scanner.nextInt();
//          String largestNum = largestNum(a,b);
//          System.out.println(largestNum);
//		    Fibonanci(a);
		    long num = scanner.nextLong();
            reverse(num);          
	}
	
	public static String largestNum(int a,int b) {
		return (a>b)?"a is greater":"b is greater";
		
	}
	public static String AlphaCase(char ch) {
		if(ch>=65 && ch <=97) {
			return "Upper";
		}
		else if(ch >=97 && ch <=122) {
			return "Lower";
		}
		return null;
	}
	public static void Fibonanci(int n) {
		int num1=0,num2=1;
		System.out.print(num1+" "+num2+" ");
		int cnt=2;
		while( cnt <=n) {
			int num3=num2;
			num2=num2+num1;
			num1=num3;
			System.out.print(num2+" ");
			cnt++;
		}
		System.out.println("\n"+num2);
	}
	public static void reverse(long num) {
		int rem=0,rev=0;
		while(num > 0) {
			rem=(int) (num%10);
			rev=rev*10+rem;
			num/=10;
		}
		System.out.println(rev);
		
	}  
	public static int occurance(long num,int k) {
		int count=0;
		while(num >0) {
			int rem =(int) (num%10);
			if(rem==k)
				count++;
			num/=10;
		}
		return count;
	}
	public static void occurance1(long num,int k) {
//		String str=Long.toString(num);
//		String str1=String.valueOf(num);
		String str2=" "+num;
		char str3 =(char) k;
		int count=0;
		for(int i=0;i<str2.length();i++) {
			if(str2.charAt(i)==str3) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
