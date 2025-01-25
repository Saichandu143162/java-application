package com.mru.ass;

public class Question3 {

	public static void main(String[] args) {
		
		int arr[] = {12, 34, 56};

        
        for (int i = 0; i < arr.length; i++) {
            int product = 1; 
            while (arr[i] > 0) {
                int last = arr[i] % 10;  
                product *= last;          
                arr[i] = arr[i] / 10;     
            }
            arr[i] = product;  
        }

        
        for (int i : arr) {
            System.out.print(i + " ");
        }

	}

}
