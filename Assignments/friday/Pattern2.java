package friday;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int arr[][]=  {{10,20,30},{50,60,70,80},{90,100},{130,140,150,160}};
	    
	   // int arr[][]={{10,20,30,40},{50,60,70,80},{90,100,110,120},{130,140,150,160}};
	     for(int i=0;i<arr.length;i++)
	     {
	         for(int j=0;j<arr[i].length;j++)
	         {
	             System.out.print(arr[i][j]+"  ");
	         }
	         System.out.println();
	     }
	     System.out.println(">>>>>>>>>");
//			int n=arr.length;
//			for(int i=0;i<n;i++) {
//				int temp=i;
//				int j=0;
//				
//				while(temp!=0) {
//					System.out.print(arr[temp--][j++]+"  ");
//				}
//				System.out.println(arr[temp][j]);
//			}
//			
//			for(int i=1;i<n;i++) {
//				int temp=i;
//				int j=n-1;
//				
//				while(temp!=n-1) {
//					System.out.print(arr[j--][temp++]+"  ");
//				}
//				System.out.println(arr[j][temp]);
//			}
//		
	     
	     int n = arr.length;

	  // Traverse diagonals starting from the first column of the matrix
	  for (int i = 0; i < n; i++) {
	      int temp = i;
	      int j = 0;

	      while (temp != 0 && j < arr[temp].length) {
	          System.out.print(arr[temp--][j++] + "  ");
	      }
	      if (j < arr[temp].length) {
	          System.out.println(arr[temp][j]);
	      } else {
	          System.out.println();
	      }
	  }

	  // Traverse diagonals starting from the last row of the matrix
	  for (int i = 1; i < n; i++) {
	      int temp = i;
	      int j = n - 1;

	      while (temp != n - 1 && j >= 0 && j < arr[j].length) {
	          System.out.print(arr[j--][temp++] + "  ");
	      }
	      if (j >= 0 && temp < arr[j].length) {
	          System.out.println(arr[j][temp]);
	      } else {
	          System.out.println();
	      }
	  }

		

	}

}
