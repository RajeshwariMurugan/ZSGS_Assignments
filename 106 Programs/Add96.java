import java.util.Scanner;

public class Add96
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Value");
		int a=sc.nextInt();
		System.out.println("Enter Second Value");
		int b=sc.nextInt();
      int c=Math.min(a,b);
      int d=Math.max(a,b);
      int ans=0;

      for(int i=1;i<=c;i++)
      {
      	ans+=d;
      }
		
      System.out.println(ans);
	}
}