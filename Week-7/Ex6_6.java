git 

import java.util.Arrays;
import java.util.Scanner;

public class Ex6_6 {
	
	public static int closest3sum(int arr1[], int target ) {
		
		int left = 0;
		int right = 0;
		int result = 0;
		int closestsum = Integer.MAX_VALUE;
		Arrays.sort(arr1);
		for(int i=0; i<arr1.length-2;i++)
		{
			left = i+1;
			right = arr1.length-1;
			while(left < right) {
				int out = Math.abs((target-(arr1[i]+arr1[left]+arr1[right])));
				System.out.println("Output"+out);
				
				if(out < closestsum) {
					closestsum = out;
					result = arr1[i]+arr1[left]+arr1[right];
				}
				
				if((arr1[i]+arr1[left]+arr1[right])>target) {
					System.out.println("right");
					right--;
				}
				else {
					System.out.println("left");
					left++;
				}
			}
			
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		int result = closest3sum(arr1, diff);
		System.out.println(result);


	}

}
