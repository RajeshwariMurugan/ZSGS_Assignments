import java.util.*;
public class p9
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter First array elements Count");
int n1=sc.nextInt();
System.out.println("Enter First array ");
int array1[]=new int[n1];

for(int i=0;i<n1;i++)
{
Scanner Sc=new Scanner(System.in);
array1[i]=Sc.nextInt();
}

System.out.println("Enter Second array elements Count");
int n2=sc.nextInt();
System.out.println("Enter Second array ");
int array2[]=new int[n2];
for(int i=0;i<n2;i++)
{
Scanner Sc=new Scanner(System.in);
array2[i]=Sc.nextInt();
}
int Ans[]=new int[n1+n2];


int j=0,k=0,L=0;

while(L<n1)
{
Ans[k]=array1[L];
L++;
k++;
}
while(j<n2)
{
Ans[k]=array2[j];
j++;
k++;
}
Arrays.sort(Ans);
System.out.println("Enter Sort & merge Array");
for(int i=0;i<=(n1+n2);i++)
{
if(i>=(n1+n2)-1)
{
System.out.println(Ans[i]);
}
else 
{
if(Ans[i]!=Ans[i+1])
{
System.out.println(Ans[i]);
}
}
}






}
}
