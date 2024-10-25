// Java program to reverse a string using recursion
import java.util.Scanner;
class StringReverse106
{
	/* Function to print reverse of the passed string */
	void reverse(String str)
	{
		if ((str==null)||(str.length() <= 1))
		System.out.println(str);
		else
		{
			System.out.print(str.charAt(str.length()-1));
			reverse(str.substring(0,str.length()-1));
		}
	}
	
	/* Driver program to test above function */
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Word");
		String str = sc.nextLine();
		StringReverse106 obj = new StringReverse106();
		obj.reverse(str);
	} 
}
