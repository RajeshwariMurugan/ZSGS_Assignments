import java.util.Scanner;

public class Reverse6
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter repeated duplicate");
		String a=sc.nextLine();
		
	 	int l=a.length();
	 	String b="";
	 	int i=0,j=0,count=0;
	for(i=0;i<a.length();i++)
	{
	 		for(j=1;j<i;j++)
	 		{

	 			System.out.println(a.charAt(j)+"	"+a.charAt(i));
	 			if(a.charAt(j)==a.charAt(i))
				{
	 				//count++;
	 				char A=a.charAt(j);
	 					b+=A++;
	 			}
	 			else
	 				b+=a.charAt(i);

	 		}
	 	b+=a.charAt(i);
	 			
	 } 	 
	String c=b.substring(0,l);
       //alert(c);

System.out.println(c);
}
} 