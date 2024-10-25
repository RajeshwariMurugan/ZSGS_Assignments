import java.util.Scanner;

public class Wrapper10
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Money");
		int money=sc.nextInt();
		System.out.println("Enter Price");
		int price =sc.nextInt();
		System.out.println("Enter Wrappers");
		int wrappers=sc.nextInt();
		System.out.println("Enter Choco");
		int choco =sc.nextInt();
		System.out.println("Enter MaxVisit");
		int max=sc.nextInt();

		int total=money/price;
		int hand=total;

		if(wrappers<=choco)
		{
			System.out.println("****");
			return;
		}
		
		int addchoco;
		int count=0;

		while(hand>=wrappers&&(max==0||count<max))
		{
			addchoco=hand/wrappers;
			total+=addchoco;
			hand=hand%wrappers+addchoco;
			count++;
		}
		System.out.println("Total :"+total);
		System.out.println("hans :"+hand);
	}
}