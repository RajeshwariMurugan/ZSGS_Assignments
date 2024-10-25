import java.util.Scanner;

public class p3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number :");
int n=sc.nextInt();
int number=n;
int rev=0,rem;
while(n!=0)
{
rem=n%10;
rev=rev*10+rem;
n=n/10;
}
System.out.println(number-rev);
}
}
