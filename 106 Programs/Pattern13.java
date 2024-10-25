import java.util.Scanner;


public class Pattern13
 {
    
public static void main(String[] args) 
{
       
 Scanner sc=new Scanner(System.in);
        
String word=sc.nextLine();
        
int wordLength=word.length();

   
     for(int i=0;i<wordLength;i++)
{
       
     for(int j=0;j<wordLength;j++)
{
           
     if(i==j)
{
                   
 System.out.print(word.charAt(i));
      
          }
else if(j==wordLength-i-1)
{
                  
  System.out.print(word.charAt(i));
        
        }
else
{
                  
  System.out.print(" ");
               
 }
         
   }
           
 System.out.println();
      
  }
  
  }

}