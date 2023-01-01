

import java.util.*;
public class Ex6_3 {
	
	public static void sortArray(int arr[])
	{
		int c1 = 0, c2 = 0, c3 =0;
		for (int i = 0; i<arr.length; i++) {
			if (arr[i] == 0) {
				c1++;
			}
			else if(arr[i] == 1)
			{
				c2++;
			}
			else if(arr[i] ==2) {
				c3++;
			}
		}
		
		
		
		int counter =0;
		while(c1>0) {
			arr[counter++] = 0;
			c1--;
		}
        while(c2>0){
            arr[counter++] = 1;
            c2--;
        }
        while(c3>0){
            arr[counter++] = 2;
            c3--;
        }
	
		
		for(int i = 0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements: ");
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		sortArray(arr);
		
	}

}
