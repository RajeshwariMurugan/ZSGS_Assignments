public class p4
{
public static void main(String args[])
{
	int num1=5;
	int num2=1;
	System.out.println("Bitwise AND  "+(num1&num2));
	System.out.println("Bitwise OR  "+(num1|num2));
	System.out.println("Bitwise XOR  "+(num1^num2));
	System.out.println("Bitwise NOT  "+(~num1)+" "+(~num2));
	System.out.println("Bitwise LeftShift  "+(num1<<num2));
	System.out.println("Bitwise RightShift  "+(num1>>num2));
	//System.out.println("Bitwise UnsignedLeftShift  "+(num2<<<num1));
	System.out.println("Bitwise UnsignedRightShift  "+(num1>>>num2));

	System.out.println(5<<2);
}
}