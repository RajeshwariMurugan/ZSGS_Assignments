import java.util.Arrays;
import java.util.Scanner;

class Frequency101
{
	
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("ENter length of Array");
	int n = sc.nextInt();
	System.out.println("*************");
	int arr[] = new int[n];
	
	for(int i=0;i<n;i++)
	{
	arr[i]=sc.nextInt();
	}
	System.out.println("**************");
boolean visited[] = new boolean[n];
	
	Arrays.fill(visited, false);

	for (int i = 0; i < n; i++) {

		
		if (visited[i] == true)
			continue;

		// Count frequency
		int count = 1;
		for (int j = i + 1; j < n; j++) {
			if (arr[i] == arr[j]) {
				visited[j] = true;
				count++;
			}
		}
		System.out.println(arr[i] + " " + count);
	}


	
}
}

