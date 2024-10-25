import java.util.Scanner;

public class MiddleAdd3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("ENter How many  Value  you print");
int n=sc.nextInt();

int arr1[]=new int[n];
System.out.println("******Enter Values*******");

for(int i=0;i<n;i++)
{
		arr1[i]=sc.nextInt();
	
}
int Sum1=0,Sum2=0,index;

for(int i=0;i<arr1.length;i++)
{
index=i+1;
for(int j=0;j<arr1.length;j++)
{
 if(j<index)
{
Sum1+=arr1[j];
}
else if(j>index)
{
Sum2+=arr1[j];
}


}
if(Sum1==Sum2){
System.out.println("Equilllibrium "+index);
break;
}
else{
	Sum1=0;
	Sum2=0;
	continue;
}


}
if(Sum1!=Sum2)
System.out.println("Equilllibrium is -1");
}
}
