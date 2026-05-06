import java.util.Scanner;


class JS1_Division_Facts
{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Type in the first number: ");
		int dividend = scanner.nextInt();
		System.out.print("Type in the second number: ");
		int divisor = scanner.nextInt();
		
		int quotient = dividend / divisor;
		int remainder = dividend - divisor * quotient;
		
		System.out.println(divisor + " divided by " + dividend + " equals " + quotient + " with a remainder of " + remainder + ".");
	}
}