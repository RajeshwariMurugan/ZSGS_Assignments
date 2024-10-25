import java.util.Scanner;

public class Grad7
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the java Version(00.0.0)");
		String Version1=sc.nextLine();
		String Version2=sc.nextLine();

		String[] v1=Version1.split("\\.");
		String[] v2=Version2.split("\\.");
		//System.out.println("HII"+v1.length);
		for(int i=0;i<=v1.length;i++)
		{
			int v11=Integer.valueOf(v1[i]);
			int v21=Integer.valueOf(v2[i]);
			//System.out.println(v11+  "   "+v21);

			if(v11==v21)
			{
			//System.out.println("####");
				continue;
			}
			else if(v11<v21)
			{
			System.out.println("Upgrade");
			break;
			}
			else
			{
			System.out.println("Downgrade");
		break;
	}
		}
	}
}