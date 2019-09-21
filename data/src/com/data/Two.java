package com.data;

import java.util.Scanner;

public class Two {
	
	public static void main(String[] args) {
		int[] a = {5, 7, 4, 3, 9};
		//search(a);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter number");
		int x = scanner.nextInt();
		int location = 1;
		while(location <= a.length && a[location] != x) {
			System.out.println(location++);
			
		}
		if(location > a.length) {
			System.out.println(location = 0);
		}

	}
	/*
	public static void search(int[] a) {
		int location = 1;
		while(location <= a.length && a[location] != x) {
			
		}
		
	}*/
}
