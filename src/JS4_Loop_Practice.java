class JS4_Loop_Practice
{
	public static void main(String[] args) {
		
		// Using a for loop, print the numbers from 1 to 10.
		System.out.println("\nNumbers from 1 to 10: ");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		
		// Using a for loop, print the even numbers from 2 to 10.
		System.out.println("\n\nEven numbers from 1 to 10: ");
		for (int i = 2; i <= 10; i += 2) {
			System.out.print(i + " ");
		}
		
		// Using a for loop, print the numbers from 10 to 1.
		System.out.println("\n\nNumbers from 10 to 1: ");
		for (int i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}
		
		// Using a for loop (and an extra variable), find the sum of the numbers from 1 to 100.
		System.out.println("\n\nSum of the numbers from 1 to 100: ");
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
		System.out.print(sum);
		
		// Now, do all of these problems again with while loops!
		
		System.out.println("\n\nNumbers from 1 to 10: ");
		int i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println("\n\nEven numbers from 1 to 10: ");
		i = 2;
		while (i <= 10) {
			System.out.print(i + " ");
			i += 2;
		}
		
		System.out.println("\n\nNumbers from 10 to 1: ");
		i = 10;
		while (i >= 1) {
			System.out.print(i + " ");
			i--;
		}
		
		System.out.println("\n\nSum of the numbers from 1 to 100: ");
		i = 0;
		sum = 0;
		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.print(sum);
	}
}