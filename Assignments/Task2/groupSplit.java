/**
 * 
 */
package Task2;

import java.util.Scanner;

/**
   3) Write a program for the following. Let consider 20 students in a class with the roll no
101-120. We are going to split them into four groups. Based on their roll number we are
going to split them with the following logics.
	Example 1:
			Input : Total Number of students : 20
			Output:
			
					Group 1:
					101
					105
					109
					113
					117
					
					Group 2:
					102
					106
					110
					114
					118
					
					Group 3:
					103
					107
					111
					115
					119
					
					Group 4:
					104
					108
					112
					116
					120
 */
public class groupSplit {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Total number of students");
		int totalStudents = sc.nextInt();
		
		System.out.println("Enter starting RollNumber");
		int startRollNumber = sc.nextInt();
		
		int groups = 4;

		String[] group1 = new String[totalStudents / groups];
		String[] group2 = new String[totalStudents / groups];
		String[] group3 = new String[totalStudents / groups];
		String[] group4 = new String[totalStudents / groups];

		for (int i = 0; i < totalStudents; i++) {
			int rollNumber = startRollNumber + i;
			if (i % groups == 0) {
				group1[i / groups] = "Group 1: " + rollNumber;
			} else if (i % groups == 1) {
				group2[i / groups] = "Group 2: " + rollNumber;
			} else if (i % groups == 2) {
				group3[i / groups] = "Group 3: " + rollNumber;
			} else {
				group4[i / groups] = "Group 4: " + rollNumber;
			}
		}

		printGroup(group1);
		printGroup(group2);
		printGroup(group3);
		printGroup(group4);
	}

	private static void printGroup(String[] group) {
		for (String student : group) {
			System.out.println(student);
		}
		System.out.println();
	}

}
