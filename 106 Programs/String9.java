import java.util.Scanner;

public class String9
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String1");
		String string1=sc.nextLine();
		System.out.println("Enter String2");
		String string2=sc.nextLine();

		String a="";

		String words[]=string1.split(" ");

	Loop:	for(int i=0;i<words.length;i++)
		{
			if(words[i].contains(string2))
			{
				for(int j=words.length-1;j>=i;j--)
				{
					a+=words[j]+" ";
					if(i==j)
						break Loop;

					}
				
			}
			a+=words[i]+" ";
		}
		System.out.println(a);

		}
}