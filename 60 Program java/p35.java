import java.util.Scanner;

public class p35
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter factorial Number ");
int n=sc.nextInt();

if(n==0 ||n==1)
{
System.out.println(n + "is Factorial  1");
System.out.println("Sum Of Digits   :   "+n);
}
else
{
int fact =1;
for(int i=2;i<=n;i++)
fact*=i;
System.out.println(n + "is Factorial  "+fact);
int sum=0;
while(fact!=0)
{
sum+=fact%10;
fact/=10;
}
System.out.println("Sum Of Digits   :   "+sum);
}
}
} 