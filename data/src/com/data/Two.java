package com.data;

import java.util.Scanner;

public class Two {
	
	public static void main(String[] args) {
		int[] a = {5, 7, 4, 3, 9};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter number");
		int x = scanner.nextInt();
		int location = 1;
		while(location <= a.length && a[location - 1] != x) {
			location++;	
		}
		if(location > a.length) {
			location = 0;
		}
		System.out.println(location);

	}
}
