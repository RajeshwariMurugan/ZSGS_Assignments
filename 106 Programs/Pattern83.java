import java.util.Scanner;

public class Pattern83  
{              
public static void main(String[] args)   
{  
Scanner sc=new Scanner(System.in);
System.out.println("ENter any Number");
int n = sc.nextInt();    //n is the number of rows you want to print  
for (int i = 0; i < n; i++)   
{  
int number = 1;  
System.out.printf("%" + (n - i) * 2 + "s", "");  
for (int j = 0; j <= i; j++)   
{  
System.out.printf("%4d", number);  
number = number * (i - j) / (j + 1); 
System.out.print(number); 
}  
System.out.println();  
}  
}  
}  
