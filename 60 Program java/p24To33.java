import java.util.Scanner;
public class p24To33
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any Number to 24to33");
int a=sc.nextInt();
switch(a)
{
case 24:

System.out.println("Enter character");
char ch1=sc.next().charAt(0);
        
        int ascii = ch1;
         System.out.println("The ASCII value of " + ch1 + " is: " + ascii);
        break;

case 25:

System.out.println("Enter dividend");
int dividend=sc.nextInt();
System.out.println("Enter divisor");
int divisor=sc.nextInt();


     int quotient = dividend / divisor;
    int remainder = dividend % divisor;

    System.out.println("Quotient = " + quotient);
    System.out.println("Remainder = " + remainder);
break;


case 27:

 System.out.println("Enter the value of X and Y");  
    int    x = sc.nextInt();  
     int  y = sc.nextInt();  
       System.out.println("before swapping numbers: "+x +"  "+ y);  
    
    int   t = x;  
       x = y;  
       y = t;  
       System.out.println("After swapping: "+x +"   " + y);  
       System.out.println( );  
break;


case 28:

System.out.println("Enter num");
int Num=sc.nextInt();
String s=(Num%2==0)? "Even":"Odd";
System.out.println(Num+" is a "+s+" number");
break;

case 29:
System.out.println("Enter character");
char ch=sc.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

break;

case 30:
System.out.println("Enter number1");
int one=sc.nextInt();
System.out.println("Enter number2");
int two=sc.nextInt();
System.out.println("Enter number3");
int three=sc.nextInt();

if(one>=two && one>=three)
{
System.out.println("The highest Value is number1 "+one);
}
 else if(two>one && two>=three)
{
System.out.println("The highest Value is number2  "+two);
}
else
{
System.out.println("The highest Value is number3  "+three);
}
break;

case 31:

System.out.println("Enter number X*X ");
Double as=sc.nextDouble();
System.out.println("Enter number X");
Double bs=sc.nextDouble();
System.out.println("Enter number ");
Double cs=sc.nextDouble();
Double root1,root2;
Double d=(bs*bs)-(4*as*cs);

if(d>0)
{
 root1=(-bs+Math.sqrt(d))/(2*as*cs);
 root2=(-bs-Math.sqrt(d))/(2*as*cs);
System.out.println("The roots are "+root1+"  And "+root2);
}

else if(d==0)
{
 root1=(-bs)/(2*as*cs);
 //root2=(-bs)/(2*as*cs);
System.out.println("The roots are "+root1+"  And "+root1);
}
else
{
root1= -bs/2*as;
root2= Math.sqrt(-d)/(2*as);
System.out.println( "The roots are "+root1+"  And "+root2);
}

break;

case 32:
System.out.println("Enter num");
int num=sc.nextInt();
String ans=(num>0)?"Positive Number":"Negative Number";
System.out.println(num+ " is a "+ans);
break;

case 33:
System.out.println("Enter character");
char c=sc.next().charAt(0);


if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");
 break;

}
}
}