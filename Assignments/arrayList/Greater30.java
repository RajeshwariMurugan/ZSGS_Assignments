package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Greater30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>values=new ArrayList<>();
		values.add(10);
		values.add(20);
		values.add(30);
		values.add(40);
		values.add(50);
		
//		for(Integer ans:values)
//			if(ans>30)
//			System.out.println(ans);
		
		 Iterator<Integer> iterator = values.iterator();
	        while (iterator.hasNext()) {
	            int num = iterator.next();
	            if (num > 30) {
	                iterator.remove();
	            }
	        }

		

	}

}
