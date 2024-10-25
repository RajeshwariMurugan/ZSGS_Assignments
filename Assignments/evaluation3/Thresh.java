package evaluation3;

public class Thresh {
	    public static void main(String[] args) {
	        int[] arr= {4,4,4,4,4};
	        int threshold = 3;
	        int count = 0;

	       for(int i=0;i<arr.length;i++) {
	            count += (arr[i] + threshold - 1) / threshold;   
	            System.out.println(count);
	        }

	        System.out.println("Count: "+count);
	    }
	
}
