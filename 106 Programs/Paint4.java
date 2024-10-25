import java.util.Scanner;

public class Paint4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("ENter How many Rows You want");
int row=sc.nextInt();
System.out.println("ENter How many Columns You want");
int col=sc.nextInt();
System.out.println("******Enter Values*******");
int arr1[][]=new int[row][col];
for(int i=0;i<row;i++)
{
	for(int j=0;j<col;j++)
	{
		arr1[i][j]=sc.nextInt();
	}
	
}
System.out.println("**********");
for(int i=0;i<row;i++)
{
	for(int j=0;j<col;j++)
	{
		
		System.out.print(arr1[i][j]+" ");
	}
	System.out.println();
}

System.out.println("ENter Any Row Value");
int x=sc.nextInt();
System.out.println("ENter ANy Col Value");
int y=sc.nextInt();
System.out.println("ENter change the number");
int newColor=sc.nextInt();
System.out.println("******Enter Values*******");

int Col=arr1[x-1][y-1];
System.out.println("Color"+Col);
int i=0,j=0;
for(i=0;i<row;i++)
{
	for(j=0;j<col;j++)
	{
		if(arr1[i][j]==Col)
		{
			arr1[i][j]=newColor;
		}
System.out.print(arr1[i][j]+" ");
	}
System.out.println();	
}


}
}