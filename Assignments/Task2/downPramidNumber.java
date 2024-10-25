package Task2;

import java.util.Scanner;


public class downPramidNumber {
	
	/**
	
	22)Enter the number of rows: 5
			
			5 5 5 5 5
			 4 4 4 4 
			  3 3 3 
			   2 2
			    1
	
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter the number of rows: ");
		 int rows = sc.nextInt();    
		 int temp=rows;
		    for (int i= 0; i<= rows-1 ; i++)
		    {
		        for (int j=0; j<=i; j++)
		        {
		            System.out.print(" ");
		        }
		        for (int k=0; k<=rows-1-i; k++)
		        {
		            System.out.print(temp + " ");
		        }
		        System.out.println();
		        temp--;
		    }
		    sc.close();
		 

	}

}
