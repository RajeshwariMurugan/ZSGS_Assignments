import java.util.Scanner;

public class Dictionary47
{
public static void main(String args[])
{

	Scanner sc=new Scanner(System.in);
System.out.println("Enter Any Word i,like,sam,sung,samsung,mobile,ice,cream,icecream,man,go,mango");
String str=sc.nextLine();

String dic[]={"i","like","sam","sung","samsung","mobile","ice","cream","icecream","man","go","mango"};


for(int i=0;i<dic.length;i++)
{
	if(str.contains(dic[i]))
	{
		System.out.println("Yes");
	}
}
}
}





