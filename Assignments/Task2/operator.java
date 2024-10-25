
package Task2;

/**
 * 6) Evaluate the following expression on paper and on program and understand the difference 
 					i) ++a-b– ii) a%b++ iii) a*=b+5 iv) x=69>>>2 
    7) Evaluate the following expression on paper and on program and understand the difference
  					a+=a++ + ++a + –a + a–; when a=28
 */
public class operator {

	public static void main(String[] args) {

		int a = 28, b = 10;
		System.out.println(++a - b--);
		System.out.println(a % b++);
		System.out.println(a *= b + 5);
		System.out.println(69 >>> 2);
		System.out.println(a += a++ + ++a + -a + a--);

	}

}
