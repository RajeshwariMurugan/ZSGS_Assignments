import java.util.*;
public class AlterSort14
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter First array elements Count");
int n1=sc.nextInt();
System.out.println("Enter First array ");
int array1[]=new int[n1];
int array2[]=new int[n1];


for(int i=0;i<n1;i++)
{
Scanner Sc=new Scanner(System.in);
array1[i]=Sc.nextInt();
}
Arrays.sort(array1);
System.out.println("ENter Answer Array");
int a=1,k=0;
for(int i=1;i<=n1;i++)
{
if(i%2!=0)
{
array2[k]=array1[n1-a];
System.out.println(array2[k]);
a++;
}
else
{
array2[k]=array1[a-2];
System.out.println(array2[k]);

}



}
}
}