import java.util.Scanner;

public class p34
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter How many Numbers Add : ");
int n=sc.nextInt();
int sum=0;
for(int i=0;i<=n;i++)
sum+=i;
int Sum=sum;
int max=0;
while(sum>0)
{
int digit=sum%10;
max=Math.max(max,digit);
sum/=10;
}
System.out.println(Sum+"  Largest digit  : "+max);
}
}
