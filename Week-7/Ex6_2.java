

import java.util.*;
public class Ex6_2 {
	
	public static ArrayList<Integer> spiralOrderMatrix(int arr2[][]) {
		int k = 0 , l = 0;
		int m = arr2.length, n = arr2[0].length;
        System.out.println("Rows m :"+m);
        System.out.println("Columns n: "+n);
        int i = 0;
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		while(k<m && l<n) {
			for (i = l; i < n; ++i) {
                System.out.print(arr2[k][i] + " ");
                l1.add(arr2[k][i]);
            }
            k++;
 
         
            for (i = k; i < m; ++i) {
                System.out.print(arr2[i][n - 1] + " ");
                l1.add(arr2[i][n-1]);
            }
            n--;
 
          
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    System.out.print(arr2[m - 1][i] + " ");
                    l1.add(arr2[m-1][i]);
                }
                m--;
            }
 
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    System.out.print(arr2[i][l] + " ");
                    l1.add(arr2[i][l]);
                }
                l++;
            }
        
    }
        
 return l1;
      
		 	
}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows: ");
		int r = sc.nextInt();
		System.out.println("Enter columns: ");
		int c = sc.nextInt();
		int arr1[][] = new int[r][c];
		System.out.println("Enter array elements: ");
		for(int i=0;i<r;i++) {
			for(int j=0; j<c;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		spiralOrderMatrix(arr1);
	}

}
