import java.util.*;

public class Duplicate36
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter String with Duplicates");
String str=sc.nextLine();

char str1[]=str.toCharArray();
int i,j,index=0;


for(i=0;i<str1.length;i++)
{
for(j=0;j<i;j++)
{
if(str1[i]==str1[j])
break;
}
if(j==i)
str1[index++]=str1[i];
}

System.out.println(String.valueOf(Arrays.copyOf(str1,index)));


}
}
