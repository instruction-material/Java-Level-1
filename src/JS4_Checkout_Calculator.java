import java.util.Scanner;


class JS4_Checkout_Calculator
{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double totalPrice = 0;
		
		while (true) {
			System.out.print("What is the cost of your next item? (Enter 0 to stop.) ");
			double price = in.nextDouble();
			
			if (price == 0) {
				break;
			} else {
				totalPrice += price;
			}
		}
		
		System.out.println("Your total is $" + totalPrice + ".");
	}
}