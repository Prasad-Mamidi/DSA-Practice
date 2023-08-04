package com.dsa.learning;

import java.util.Scanner;

public class Armstrong {
	static Scanner scanner = new Scanner(System.in);

	static boolean isArmstrong(long n) {
		long sum = 0, temp = n;
		while (n > 0) {
			long rem = n % 10;
			sum = sum + rem * rem * rem;
			n /= 10;
		}
		return sum == temp;
	}

	public static void main(String[] args) {
		int n = scanner.nextInt();
		boolean armstrong = isArmstrong(n);
		System.out.println(armstrong);

		// three armstrong numbers
		for (int i = 1; i < 1000; i++) {
			if (isArmstrong(i)) {
				System.out.println(i);
			}
		}
	}
}
