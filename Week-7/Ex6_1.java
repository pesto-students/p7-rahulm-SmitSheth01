


import java.util.*;
public class Ex6_1 {

	public static int maxSumContiguousSubArray(int arr2[]){
		
		int sum =0;
		int max_on_index = 0;
		int max = 0;
		int start = 0;
		int end = 0;
		int s = 0;
		for(int i = 0; i < arr2.length; i++) {
			
			max_on_index += arr2[i];
			if(max_on_index > max)
			{
				max =  max_on_index;
				end = i;
				start = s;
			}
			if(max_on_index < 0)
			{
				max_on_index = 0;
				s = i+1;
			}
			
		}
		System.out.println("Start: "+start+" ending index: "+ end);
		
		return max;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of Elements: ");
		int n = sc.nextInt();
		System.out.println("Enter elements of array: ");
		int arr1[] = new int[n];
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.println(maxSumContiguousSubArray(arr1));

	}

}
