import java.util.Scanner;

public class p3839 {

 public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter How many numbers print");
int n=sc.nextInt();
int i;
int[] numbers=new int[n];
for( i=0;i<n;i++)
{
   numbers[i] = sc.nextInt();
}

  //assign first element of an array to largest and smallest
  int smallest = numbers[0];
  int largetst = numbers[0];

  for ( i = 1; i < numbers.length; i++) {
   if (numbers[i] > largetst)
    largetst = numbers[i];
   else if (numbers[i] < smallest)
    smallest = numbers[i];
  }

  System.out.println("Largest Number is : " + largetst);
  System.out.println("Smallest Number is : " + smallest);
 }
}



