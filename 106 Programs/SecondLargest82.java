import java.util.Scanner;

public class SecondLargest82{  
public static void main(String args[]){  
Scanner sc=new Scanner(System.in);
System.out.println("Enter How many Number");
int total=sc.nextInt();
System.out.println("*****");
int a[]=new int[total];
for(int i=0;i<total;i++)
{
a[i]=sc.nextInt();
}
System.out.println("*******");

int temp;  
for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  


System.out.println("Second Largest: "+a[total-2]);  }
}  
