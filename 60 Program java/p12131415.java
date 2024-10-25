import java.util.Scanner;
public class p12131415
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 12||13 ||14||15");
int  val=sc.nextInt();
switch(val)
{
case 12:
System.out.println("Enter NUMber");
Double Num=sc.nextDouble();
System.out.println(Num);
break;
case 13:
System.out.println("Enter NUMber");
int length=sc.nextInt();
int width=sc.nextInt();

if(length==width)
{
System.out.println("Area of the square: "+(length*width));
}
else
{
System.out.println("This value is not correct. square values are only same");
}
break;
case 14:
System.out.println("Enter NUMber");
int length1=sc.nextInt();
int width1=sc.nextInt();

System.out.println("Area of the Rectangle: "+(length1*width1));
break;
case 15:
System.out.println("Enter NUMber");
int radius=sc.nextInt();
int height=sc.nextInt();

System.out.println("Area of the Cylinder: "+(3.14*radius*radius*height));
break;

}
}
}
