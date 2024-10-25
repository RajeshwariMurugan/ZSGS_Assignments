import java.util.Scanner;

public class TwistedPrime43
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("ENter any Number");
int a=sc.nextInt();
int count1=0,counts1=0,count2=0,counts2=0;
int prime=a;

int NewPrime=(int)Math.sqrt(prime);
for(int i=2;i<=NewPrime;i++)
{
if(prime%i==0)
{
counts1++;
}
else
{
count1++;
}
}

int twisted=0;
while(a>1)
{
int rem=a%10;
twisted=twisted*10+rem;
a/=10;
} 

int NewTwisted=(int)Math.sqrt(twisted);
for(int i=2;i<=NewTwisted;i++)
{
if(twisted%i==0)
{
counts2++;
}
else
{
count2++;
}
}

System.out.println((count1>0 &&counts1==0)&&(count2>0 &&counts2==0)?"Prime":"No");
}
}
	
