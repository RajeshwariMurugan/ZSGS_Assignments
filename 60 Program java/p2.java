import java.util.Scanner;

public class p2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Input : ");
char a=sc.next().charAt(0);
int as=(int)a;
for(int i=as;i<=90;i++)
{
as=(int)a;
System.out.print(a);
a++;
}
}
}