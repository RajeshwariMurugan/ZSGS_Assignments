import java.util.Scanner;

public class p3637 {  
public static void main(String[] args) {  
  
Scanner sc=new Scanner(System.in);

System.out.println("Question Number 36 to 40");
int a=sc.nextInt();

System.out.println("enter number");
int n=sc.nextInt();

int k=0;
int[] arr=new int[n];
int Value=(n%2==0)?n/2:n/2-n%2;
int[] even=new int[Value];
int[] odd=new int[Value];

System.out.println("Enter the elements of the array : ");
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}

switch(a)
{
case 36:

for(int i=0;i<arr.length;i++)
{
if(i%2==0)
{
even[k]=arr[i];
k++;
}
}
System.out.println("Even :");
for(int Even:even)
{
System.out.println(Even+"      ");
}

break;
case 37:
int k2=0;
for(int i=0;i<arr.length;i++)
{
if(i%2!=0)
{
odd[k]=arr[i];
++k;
}
}
System.out.println("Odd :");
for(int Odd:odd)
{
System.out.print(Odd +"     ");
}

break;
}











/*for(int i=0;i<arr.length;i=i+2)
{
if(i%2==0)
{
even[i]=arr[i];
}
}
for(int i=0;i<arr.length;i++)
{
if(i%2!=0)
{
odd[i]=arr[i];
}
}
switch(a)
{
case 36:

for(int Even :even)
{
System.out.println(Even);
}
break;

case 37:

for(int Odd:odd)
{
System.out.println(Odd);
}
break;
}*/

          
        
    }  
}  