import java.util.Scanner;

public class BooleanMatrix2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter  Rows");
int rows=sc.nextInt();
System.out.println("ENter Column");
int Col=sc.nextInt();
int a[][]=new int[rows][Col];
int k=0;
for(int i=0;i<rows;i++)
{
for(int j=0;j<Col;j++)
{
a[i][j]=(k%2==0)?1:0;
k++;
}

}



for(int i=0;i<rows;i++)
{
for(int j=0;j<Col;j++)
{
System.out.print(a[i][j]+ " ");
}
System.out.println();
}

}
}
