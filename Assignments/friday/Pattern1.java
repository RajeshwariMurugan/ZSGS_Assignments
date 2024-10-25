package friday;

import java.util.HashMap;
import java.util.Map;

public class Pattern1 {
	public static void main(String args[]) {
		int n = 15;
		int start = n / 2;
		int end = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j >= start && j <= end)
					System.out.print("*");

				else
					System.out.print(" ");

			}
			System.out.println();
			if (i >= n / 2) {
				start++;
				end--;
			} else {
				start--;
				end++;
			}
		}
		
		Map<Integer,Integer>map=new HashMap<>();
		System.out.println(map.put(1,2));
	}
}
