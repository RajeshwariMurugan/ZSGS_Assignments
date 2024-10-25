import java.util.Scanner;

public class AddingTwo93
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Digits");
		int a=sc.nextInt();
		System.out.println("**********");
		int arr1[]=new int[a];
		String first="";
		for(int i=0;i<a;i++)
		{
			arr1[i]=sc.nextInt();
			first+=arr1[i];
		}
		System.out.println("Enter Number of Digits");
		int b=sc.nextInt();
		System.out.println("**********");
		int arr2[]=new int[b];
		String second="";
		for(int i=0;i<b;i++)
		{
			arr2[i]=sc.nextInt();
			second+=arr2[i];
		}
		long ans=Long.parseLong(first)+Long.parseLong(second);
		System.out.println("***"+ans+"***");
	}
}