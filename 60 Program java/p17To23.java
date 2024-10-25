import java.util.Scanner;

public  class p17To23
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Question number");
int R=sc.nextInt();
switch(R)
{
case 17:
System.out.println("Enter Circle1 Radius");
int Radius=sc.nextInt();
System.out.println("Enter Circle2 Radius");
int radius=sc.nextInt();
System.out.println((double)3.14*((Radius*Radius)-(radius-radius)));

break;
case 18:
int S=0;
int c=5;
int b=6;
 S=++c+b--;
int d=c%b++;
c*=b+5;
int x=69>>>2;
System.out.println(S);
System.out.println(d);
System.out.println(c);
System.out.println(x);
break;

case 19:
int a=28;
a+=a++ + ++a + -a + a;
System.out.println("a is : "+a);
break;

case 20:
int V=5;
V=V++ * 2+3 * -V;
System.out.println("V is : "+V);
break;

case 21:
int y=10;
int z=(++y*(y++ + 5));
System.out.println("z is : "+z);
break;

case 23:
int U=5;
int U1=++U - U++ + -U;
System.out.println("U1 is : "+U1);
break;

}
}
}