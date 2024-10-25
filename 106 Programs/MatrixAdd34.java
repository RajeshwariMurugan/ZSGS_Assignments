import java.util.Scanner;
public class MatrixAdd35
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many row");
		int row=sc.nextInt();
		System.out.println("Enter how many col");
		int col=sc.nextInt();
		System.out.println("****");
		int i,j;
		int arr[][]=new int[row][col];
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}

		

		int a=arr[0][2]+arr[1][1]+arr[1][2]+arr[2][0]+arr[2][1]+arr[2][2];
		System.out.println(">>>>>"+a+">>>>");

	}
}