package com.data;

public class Test {
	 public static void main(String[] argv) {
	        int[] data = {6, 3, 7, 1, 4, 8};
	        sort(data);
	        for (int i = 0; i < data.length; i++) {
	            System.out.println(data[i]);
	        }
	    }
	    public static void sort(int[] data) {
	    	for(int i=0; i<data.length; i++) {
				int min = i;
				for(int j=i+1; j<data.length; j++) {
					if(data[j] < data[min]) {
						min = j ;
					}
				}
				int temp = data[i];
				data[i] = data[min];
				data[min] = temp;
					
				
			}
	    }

}
