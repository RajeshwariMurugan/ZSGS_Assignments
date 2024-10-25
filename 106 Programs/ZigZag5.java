import java.util.Scanner;

public class ZigZag5
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


