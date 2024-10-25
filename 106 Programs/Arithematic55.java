import java.util.Scanner;
public class Arithematic55
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Value");
		int a=sc.nextInt();
		System.out.println("Enter Second Value");
		int b=sc.nextInt();

		System.out.println("addition: "+a+"+"+b+"="+(a+b));
		System.out.println("Subtraction: "+a+"+(-"+b+") ="+(a-b));
		System.out.println("Multiplicaation : "+a*b);
		System.out.println("Division: "+a/b);

		

	}
}