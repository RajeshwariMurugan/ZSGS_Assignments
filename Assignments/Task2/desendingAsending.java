package Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class desendingAsending {
/*
 18) Write a program to sort the elements in odd positions in descending order and elements in ascending order.
		Eg 1: Input: 13,2 4,15,12,10,5
			  Output: 13,2,12,10,5,15,4
		Eg 2: Input: 1,2,3,4,5,6,7,8,9
		      Output: 9,2,7,4,5,6,3,8,1
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {13,2,4,15,12,10,5};
		
        List<Integer> oddPositions = new ArrayList<>();
        List<Integer> evenPositions = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenPositions.add(arr[i]);
            } else {
                oddPositions.add(arr[i]);
            }
        }

        Collections.sort(oddPositions);
        Collections.sort(evenPositions);

        int oddIndex = 0, evenIndex = evenPositions.size()-1;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = evenPositions.get(evenIndex--);
            } else {
                arr[i] = oddPositions.get(oddIndex++);
            }
        }

  System.out.println(Arrays.toString(arr));
	}

}
