import java.util.Scanner;
public class Pangram31  
{  
public static void main(String args[])  
{ 
Scanner sc=new Scanner(System.in);
System.out.println("enter the String"); 
String string =sc.nextLine();      // "Abcdefghijklmnopqrstuvwxyz12";  
string = string.toLowerCase();  
boolean allLetterPresent = true;  
  
for (char ch = 'a'; ch <= 'z'; ch++)   
{  
 if (!string.contains(String.valueOf(ch)))   
{  
allLetterPresent = false;  
break;  
}  
}  
  
if (allLetterPresent)  

System.out.println("Pangram String");  
else  
System.out.println("Not a Pangram String");  
 

}  
} 


