

import java.util.Arrays;
import java.util.Scanner;

public class Ex6_5 {
	
	
	
	public static int givenDifference(int[] arr1, int diff) {
		
		// TODO Auto-generated method stub
		
		int c1 = 0, c2 = arr1.length-1;
		Arrays.sort(arr1);
		diff = Math.abs(diff);
		int i = 0 ,  j = 1; 
		while( i < j && j <arr1.length )
		{
			int target = arr1[j]-arr1[i];
			if(diff == target && i !=j) {
				return 1;
			}
			else if(target > diff) {
				i++;
			}
			else {
				j++;
			}
			
		}
		
	return 0;
		
		
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
		System.out.println("Enter difference number: ");
		int diff = sc.nextInt();
		 
		System.out.println(givenDifference(arr1, diff));
		
	}

	

}





