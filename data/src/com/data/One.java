package com.data;

public class One {

	public static void main(String[] args) {
		int[] a = {5, 7, 4, 3, 9};
		selectionSort(a);
        for (int i = 0; i < a.length; i++) {
        	System.out.println(a[i]);
        }

	}
	public static void selectionSort(int[] a) {
		for(int i = 0; i < a.length; i++) {
			int min = i;
			for(int j = i+1; j < a.length; j++) {
				if(a[j] < a[min]) {
					min = j ;
				}
			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;	
		}
		
		
	}

}
