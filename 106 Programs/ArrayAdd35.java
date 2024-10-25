import java.util.Scanner;

public class ArrayAdd35
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How many Array");
		int a=sc.nextInt();
		System.out.println("**********");
		int arr1[]=new int[a];
		String first="";
		long sum=0;
		for(int i=0;i<a;i++)
		{
			arr1[i]=sc.nextInt();
			for(int j=0;j<arr1[i];j++)
			{
				first+=arr1[j];
			}
			sum+=Long.parseLong(first);
		}
		System.out.println("***"+sum+"***");
	}
}