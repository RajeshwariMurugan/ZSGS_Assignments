import java.io.*;
import java.util.Scanner;
class NextPalindrome52
{

	// Function to check whether number is palindrome or not
	static int isPalindrome(int num)
	{
	
		// Declaring variables
		int n, k, rev = 0;
	
		// storing num in n so that we can compare it later
		n = num;
	
		// while num is not 0 we find its reverse and store
		// in rev
		while (num != 0) {
			k = num % 10;
			rev = (rev * 10) + k;
			num = num / 10;
		}
	
		// check if num and its reverse are same
		if (n == rev) {
			return 1;
		}
		else {
			return 0;
		}
	}

// Driver code
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
	
		while (isPalindrome(num) == 0) {
			num = num + 1;
		}
	
		
		System.out.print("Next Palindrome :"+num);
			}
}

