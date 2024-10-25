import java.util.Scanner;

public class p1
{
public  static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter which Table u want");
int a=sc.nextInt();
for(int i=1;i<=16;i++)
{
System.out.println(i+" *"+a+"="+i*a);
}
for(int j=1;j<=16;j++)
{
System.out.println(a+" -"+j+"="+(a-j));
}


}
}
