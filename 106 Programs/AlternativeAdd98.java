import java.util.Scanner;

public class AlternativeAdd98
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many numbers u print");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("******");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("****");
		String s="";
		for(int i=0;i<arr.length-2;i++)
		{
			if(arr[i]+arr[i+1]==arr[i+2])
				s+=arr[i]+","+arr[i+1]+"="+arr[i+2];
			
		}
		System.out.println(s);
	}
}