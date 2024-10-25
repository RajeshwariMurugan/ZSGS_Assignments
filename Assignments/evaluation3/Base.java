package evaluation3;

public class Base {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num1 = 123;
//		int num2 = 13;
//		int base=4
		
		int num1=1010;
		int num2=11001; 
		int base = 2,carry=0;
		String temp="";
		
		while(num1!=0 || num2!=0 ||carry!=0) {
			int sum=carry+(num1%base) +(num2%base);
			if(sum<base) {
				temp+=sum;
				carry=0;
			}
			else
			{
				temp+=(sum % base) ;
				carry = sum / base; 
			}
			num1/=base;
			num2/=base;
		}
		System.out.println(temp);

	}
}
