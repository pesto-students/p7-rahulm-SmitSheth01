

import java.util.*;
public class Ex6_4 {
	
	public static int buyAndSellStock(int arr2[]) {
		int profit = 0;
		int c1 = 0;
		int c2 = 1;
		for(int i = 0; i<arr2.length-1 	; i++) {
			if(arr2[c1]> arr2[c2]) {
				c1 = c1+1;
			}
			else {
				if(arr2[c2]-arr2[c1]>profit) {
					profit = arr2[c2]-arr2[c1];
				}
				c2 = c2+1;
			}
			
			System.out.println("C1: "+c1);
			System.out.println("C2: "+c2);
			System.out.println("P: "+profit);
		}
		return profit;
	}
	
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of Elements: ");
		int n = sc.nextInt();
		System.out.println("Enter elements of array: ");
		int arr1[] = new int[n];
		for(int i = 0; i<arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println(buyAndSellStock(arr1));
		
	}

}
