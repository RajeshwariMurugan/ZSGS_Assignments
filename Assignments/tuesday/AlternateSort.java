package tuesday;

import java.util.Arrays;

public class AlternateSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,2,6,1,8};
		 Arrays.sort(arr);
	        int i = 0, j = arr.length - 1;
	        while (i < j) {
	            System.out.print(arr[j--] + " ");
	            System.out.print(arr[i++] + " ");
	        }
	        if (arr.length % 2 != 0) 
	            System.out.print(arr[i]); 
	}

}
