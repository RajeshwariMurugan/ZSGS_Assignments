
package Task2;

import java.util.Scanner;

/**
     24) Write a program to make such a pattern like a pyramid with numbers increased by 1. 
           Example: Input : 10 
                   Output:
                    			1
                    		   2 3 
                    		  4 5 6 
                    		 7 8 9 10
 */
public class pramidIncreaseTo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input");
		int n = sc.nextInt(); 
		int number = 1;

		for (int i = 0; i < n; i++) {
			System.out.printf("%" + (n - i) * 2 + "s", "");  

			for (int j = 0; j <= i; j++) {
				System.out.printf("%4d", number++);
			}
			if (number > n)
				break;
			System.out.println();
		}
	}

}
