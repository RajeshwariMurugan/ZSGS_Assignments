import java.util.Scanner;

public class NextHigh1
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter How many  Values you want");
	int n=sc.nextInt();
	System.out.println("********");
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}

//int []a={16,17,4,3,5,2};
int k=0;
	int j=0;
for(int i=0;i<a.length-1;i++)
{
	k=a[i+1];
		for(j=i+1;j<a.length;j++)
			{
				if(k<a[j])
				{
					k=a[j];
				}
			}
			a[i]=k;
		


}
a[a.length-2]=a[a.length-1];
a[a.length-1]=-1;
int i=0;
System.out.println("*****");
for(i=0;i<a.length;i++)
{

				System.out.println(a[i]);


}



}
}
