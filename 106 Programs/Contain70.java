import java.util.Scanner;

public class Contain70
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter  a big number"); 
int a = sc.nextInt();

System.out.println("Enter  a  number"); 
int b = sc.nextInt();

boolean contains = String.valueOf(a).contains(String.valueOf(b));
System.out.println(contains);
}
}