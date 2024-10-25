import java.util.Scanner;

public class Findsum94
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many numbers u print");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("*** Sorted Array***");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("***Enter any Value***");
		int sum=sc.nextInt();
		boolean x=false;

		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==sum)
					x=true;
			}
		}
		System.out.println(x);
	}
}