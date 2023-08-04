package com.dsa.learning;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
//         int n=scanner.nextInt();
//         boolean prime = isPrime(n);
//         System.out.println(prime);
         int count=0;
         for(int start=0;start<100;start++) {
        	 if(isPrime(start)) {
        		 count++;
        		 System.out.println(start);
        	 }
         }
         System.out.println(count);
	}

    static boolean isPrime(int n) {
		// TODO Auto-generated method stub
		if(n<=1)
			return false;
		int cnt=2;
		while(cnt*cnt<=n) {
			if(n%cnt==0) {
				return false;
			}
			cnt++;
		}
		return cnt*cnt >n;
	}

}
