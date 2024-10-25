package tuesday;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FactorsSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 11, 10, 20, 9, 16, 23 };
		
		Map<Integer,Integer>map=new HashMap<>();
		
		for (int num : arr) {
			map.put(num, countFactors(num));
		
		}
		 for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
	            System.out.println("Number: " + entry.getKey() + ", Factors: " + entry.getValue());
	        }

       
		
		

		for (int num : arr) {
			System.out.print(num+ " ");
		}
	}

	        private static int countFactors(int n) {
		        int count = 0;
		        for (int i = 1; i <= Math.sqrt(n); i++) {
		            if (n % i == 0) {
		                count += (n / i == i) ? 1 : 2;
		            }
		        }
		        return count;
		    }
}
