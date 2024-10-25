import java.util.Scanner;

public class OddEven81
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int a=sc.nextInt();
		byte Even=0,Odd=0;
		while(a>0)
		{
			int rem=a%10;
			int ans=(rem%2==0)?Even++:Odd++;
			a/=10;
		}

		System.out.println("Odd: "+Odd);
		System.out.println("Even: "+Even);
	}
}