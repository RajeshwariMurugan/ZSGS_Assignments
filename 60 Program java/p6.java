import java.util.Scanner;

public class p6
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Total number of students : ");
int a=sc.nextInt();

String p1="                             	Group 1 :\n";
String p2="		Group 2: \n";
String p3="		Group 3: \n";
String p4="		Group 4 : \n";

int b=101;


for(int i=1;i<b+a;i++)
{
p1+=b+"\n";
++b;
p2+=b+"\n";
++b;
p3+=b+"\n";
++b;
p4+=b+"\n";
++b;
}

System.out.println(p1);
System.out.println(p2);
System.out.println(p3);
System.out.println(p4);
}
}
