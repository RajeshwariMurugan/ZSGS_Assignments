import java.util.Scanner;


public class p5
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
System.out.println("Enter Input");
 char a=Sc.next().charAt(0);

int n=(int)a;

for(int i=n-64;i>0;i--)
{
for(int j=1;j<=i;j++)
{
 System.out.print(a);
}
--a;
System.out.println();
}


}
}
