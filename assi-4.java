package com.mru.ass;

public class Question4 {

	public static void main(String[] args) {
		 int arr[] = {1, 2, 3, 4, 5, 6};
	        int First = 0, Last = arr.length - 1;

	        
	        while (First < Last) {
	            int sum = arr[First] + arr[Last]; 
	            System.out.print(sum + " ");       
	            First++;                           
	            Last--;                           
	        }
	}

}
