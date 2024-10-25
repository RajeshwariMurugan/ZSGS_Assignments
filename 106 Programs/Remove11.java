import java.util.Scanner;

public class Remove11
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter any Word");
		String word=sc.nextLine();
System.out.println("Enter any number");
		int a=sc.nextInt();
		
		
		System.out.println("****");
		String odd="";
		String even="";

		for(int i=0;i<word.length();i++)
		{
			if(i%a==0)
				even+=word.charAt(i);
			else
				odd+=word.charAt(i);
		}
		System.out.println(even+" "+odd);

	}
}